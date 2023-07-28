package com.dongwu.entity;

import java.awt.*;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;


/**
 * @author liudw
 * @date 2021/4/8 8:47
 * @effect
 */

@SuppressWarnings("serial")
public class Demo extends JFrame implements Runnable {

    // 定义加载窗口大小
    public static final int GAME_WIDTH = 500;
    public static final int GAME_HEIGHT = 500;
    // 获取屏幕窗口大小
    public static final int WIDTH = Toolkit.getDefaultToolkit()
            .getScreenSize().width;
    public static final int HEIGHT = Toolkit.getDefaultToolkit()
            .getScreenSize().height;

    public Demo() {
        // 设置窗口标题
        this.setTitle("心形曲线");
        // 设置窗口初始位置
        this.setLocation((WIDTH - GAME_WIDTH) / 2, (HEIGHT - GAME_HEIGHT) / 2);
        // 设置窗口大小
        this.setSize(GAME_WIDTH, GAME_HEIGHT);
        // 设置背景色
        this.setBackground(Color.BLACK);
        // 设置窗口关闭方式
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 设置窗体大小是否可以调整——默认为true(可以调整)
        this.setResizable(true);
        // 设置窗口显示
        this.setVisible(true);
        this.enableEvents(AWTEvent.WINDOW_EVENT_MASK);
    }

    @Override
    protected void processWindowEvent(WindowEvent e) {
        if (e.getID() == WindowEvent.WINDOW_CLOSING) {
            setVisible(false);
            Demo demo1 = new Demo();
            demo1.setTitle("abc");
            Thread t = new Thread(demo1);
            t.start();
        } else {
            super.processWindowEvent(e);
        }
    }

    @Override
    public void paint(Graphics g) {

        double x, y, r;
        Image OffScreen = createImage(GAME_WIDTH, GAME_HEIGHT);
        Graphics drawOffScreen = OffScreen.getGraphics();

        for (int i = 0; i < 90; i++) {
            for (int j = 0; j < 90; j++) {
                r = Math.PI / 45 * i * (1 - Math.sin(Math.PI / 45 * j)) * 18;
                x = r * Math.cos(Math.PI / 45 * j) * Math.sin(Math.PI / 45 * i)
                        + GAME_WIDTH / 2;
                y = -r * Math.sin(Math.PI / 45 * j) + GAME_HEIGHT / 4;

                //设置画笔颜色
                drawOffScreen.setColor(Color.PINK);
                // 绘制椭圆
//                drawOffScreen.fillOval((int) x, (int) y, 10, 10);
                drawOffScreen.fill3DRect((int) x, (int) y, 10, 10, true);
            }
            // 生成图片
            g.drawImage(OffScreen, 0, 0, this);
        }
    }

    public static void main(String[] args) {
//        Demo demo = new Demo();
//        Thread t = new Thread(demo);
//        t.start();
        drawHeart();
    }

    public static void drawHeart() {
        for(float y = (float)1.5; y > -1.5; y -= 0.15) {
            for(float x = (float)-1.5; x < 1.5; x += 0.05) {
                float a = x * x  + y * y -1;
                if((a * a * a - x * x * y * y * y) <= 0.0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(2000);
                this.repaint();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}