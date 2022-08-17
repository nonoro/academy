package ex0817.homework;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;
import java.net.Socket;

public class Frame extends JFrame {

    JTextArea output;
    JTextField input;
    JButton sendBtn;
    Socket sk;


    public Frame(String name) {
        super(name);
        // 입력받은 채팅을 보여주는 TextArea만들기
        output = new JTextArea();
        output.setFont(new Font("돋움", Font.BOLD, 17));
        output.setEditable(false); // textArea에 입력이 안되도록 하는 기능
        JScrollPane scroll = new JScrollPane(output); // textArea에 스크롤 바 넣어주는 기능
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS); // 항상 스크롤바가 보이게 해주는 기능
        scroll.getHorizontalScrollBar().setValue(scroll.getHorizontalScrollBar().getMaximum());


        // 입력을 넣어줄 TextField만들기
        JPanel btn = new JPanel();
        btn.setLayout(new BorderLayout());
        input = new JTextField();

        sendBtn = new JButton("전송");


        btn.add("Center", input);
        btn.add("East", sendBtn);

        // 컨테이너에 붙이기
        Container c = this.getContentPane();
        c.add("Center", scroll);
        c.add("South", btn);


        setBounds(300, 300, 300, 300);
        setVisible(true);

        setDefaultCloseOperation(Frame.EXIT_ON_CLOSE);

        input.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = input.getText();
                output.append(text + "\n");
                input.setText("");

                try {
                    PrintWriter pw = new PrintWriter(sk.getOutputStream(), true);
                    pw.println(text);
                    pw.flush();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                scroll.getHorizontalScrollBar().setValue(scroll.getHorizontalScrollBar().getMaximum());

            }

        });

        sendBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = input.getText();
                output.append(text + "\n");
                input.setText("");

                try {
                    PrintWriter pw = new PrintWriter(sk.getOutputStream(), true);
                    pw.println(text);
                    pw.flush();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }

//                input.selectAll();
//                output.setCaretPosition(output.getDocument().getLength());
                scroll.getHorizontalScrollBar().setValue(scroll.getHorizontalScrollBar().getMaximum());

            }
        });


    }

    public static void main(String[] args) {
        new Frame("Default");
    }

    public void setSocket(Socket sk) {
        this.sk = sk;
    }

    public void setClientMessage(String message) {
        output.append(message + "\n");
    }
}
