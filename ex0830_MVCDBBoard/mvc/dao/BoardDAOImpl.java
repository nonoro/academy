package ex0830_MVCDBBoard.mvc.dao;

import ex0830_MVCDBBoard.mvc.dto.BoardDTO;
import ex0830_MVCDBBoard.mvc.dto.ReplyDTO;
import ex0830_MVCDBBoard.mvc.util.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class BoardDAOImpl implements BoardDAO {
    private Properties profile = DbUtil.getProfile();

    @Override
    public List<BoardDTO> boardSelectAll() throws SQLException {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<BoardDTO> list = new ArrayList<>();
        String sql = profile.getProperty("board.selectAll");

        try {
            con = DbUtil.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                BoardDTO boardDTO = new BoardDTO(rs.getInt(1), rs.getString(2),
                                                 rs.getString(3), rs.getString(4),
                                                 rs.getString(5));
                list.add(boardDTO);
            }
        } finally {
            DbUtil.dbClose(con, ps, rs);
        }
        return list;
    }

    @Override
    public BoardDTO boardSelectByNo(int boardNo) throws SQLException {
        /*
        board.selectByNo=select * from board where board_no = ?
         */
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        BoardDTO boardDTO = null;
        String sql = profile.getProperty("board.selectByNo");

        try {
            con = DbUtil.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, boardNo);

            rs = ps.executeQuery();
            if (rs.next()) {
                boardDTO = new BoardDTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
            }
        } finally {
            DbUtil.dbClose(con, ps, rs);
        }
        return boardDTO;
    }

    @Override
    public List<BoardDTO> boardSelectBySubject(String keyWord) throws SQLException {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<BoardDTO> list = new ArrayList<>();
        String sql = profile.getProperty("board.selectBySubject");

        try {
            con = DbUtil.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, "%" + keyWord + "%");

            rs = ps.executeQuery();
            while (rs.next()) {
                BoardDTO boardDTO = new BoardDTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
                list.add(boardDTO);
            }
        } finally {
            DbUtil.dbClose(con, ps, rs);
        }
        return list;
    }


    @Override
    public int boardInsert(BoardDTO boardDTO) throws SQLException {
        /*
        쿼리 : insert into board (board_no, subject, writer, content, board_date) values (board_seq.nextval, ?, ?, ?, sysdate)
         */
        Connection con = null;
        PreparedStatement ps = null;
        String sql = profile.getProperty("board.insert");
        int result = 0;

        try {
            con = DbUtil.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, boardDTO.getSubject());
            ps.setString(2, boardDTO.getWriter());
            ps.setString(3, boardDTO.getContent());

            // 쿼리실행 ( 0은 실패, 1은 성공 )
            result = ps.executeUpdate();


        } finally {
            DbUtil.dbClose(con, ps);
        }
        return result;
    }

    @Override
    public int boardUpdate(BoardDTO boardDTO) throws SQLException {
        /*
        쿼리 : update board set content = ? where board_no = ?
         */
        Connection con = null;
        PreparedStatement ps = null;
        String sql = profile.getProperty("board.updateByNo");
        int result = 0;

        try {
            con = DbUtil.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, boardDTO.getContent());
            ps.setInt(2, boardDTO.getBoardNo());

            result = ps.executeUpdate();

        } finally {
            DbUtil.dbClose(con, ps);

        }
        return result;
    }

    @Override
    public int boardDelete(int boardNo) throws SQLException {
        /*
        쿼리 : board.deleteByNo=delete from board where board_no = ?
         */
        Connection con = null;
        PreparedStatement ps = null;
        String sql = profile.getProperty("board.deleteByNo");
        int result = 0;

        try {
            con = DbUtil.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, boardNo);

            result = ps.executeUpdate();
        } finally {
            DbUtil.dbClose(con, ps);
        }
        return result;
    }

    @Override
    public int replyInsert(ReplyDTO replyDTO) throws SQLException {
        /*
        쿼리 : reply.insert=insert into reply values(reply_no_seq.nextval , ?, ? , sysdate)
         */
        Connection con = null;
        PreparedStatement ps = null;
        String sql = profile.getProperty("reply.insert");
        int result = 0;

        try {
            con = DbUtil.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, replyDTO.getReplyContent());
            ps.setInt(2, replyDTO.getBoardNo());

            result = ps.executeUpdate();
        }finally {
            DbUtil.dbClose(con, ps);
        }
        return result;
    }

    @Override
    public BoardDTO replySelectByParentNo(int boardNo) throws SQLException {
          /*
        board.selectByNo=select * from board where board_no = ?
         */
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        BoardDTO boardDTO = null;
        String sql = profile.getProperty("board.selectByNo");

        try {
            con = DbUtil.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, boardNo);

            rs = ps.executeQuery();
            if (rs.next()) {
                boardDTO = new BoardDTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
                //부모 글이 있으니 댓글 정보를 가져온다.
                List<ReplyDTO> list = getInfoReply(con, boardNo);
                boardDTO.setRepliesList(list);
            }
        } finally {
            DbUtil.dbClose(con, ps, rs);
        }

        return boardDTO;
    }

    // number, subject, writer, content, date, replyNo, replycontent, boardno, replydate
    // number, subject, writer, content, date, replyNo, replycontent, boardno, replydate
    // number, subject, writer, content, date, replyNo, replycontent, boardno, replydate
    // number, subject, writer, content, date, replyNo, replycontent, boardno, replydate
    // number, subject, writer, content, date, replyNo, replycontent, boardno, replydate
    // board = new BoardDto(... .. ... )
    // while
    // list.add(new Reply(replyno, replycontent, replydate, boardno))
    // board.setReplylist(list)
/**
 *  부모글의 댓글정보 가져오기
 */
    private List<ReplyDTO> getInfoReply(Connection con, int boardNo) throws SQLException { // 부모글번호
        /*
        쿼리 : reply.selectByboardNo=select * from reply where board_no=?
         */
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<ReplyDTO> list = new ArrayList<>();
        String sql = profile.getProperty("reply.selectByboardNo");

        try {
            con = DbUtil.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, boardNo);


            rs = ps.executeQuery();

            while (rs.next()) {
                ReplyDTO replyDTO = new ReplyDTO(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4));
                list.add(replyDTO);
            }

        } finally {
            DbUtil.dbClose(null, ps, rs); // 주의 여기선 connection을 닫으면 안됨 위에서 닫아야됨
        }
        return list;
    }
} // 클래스 끝
