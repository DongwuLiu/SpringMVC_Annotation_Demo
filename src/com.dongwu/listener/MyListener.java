package com.dongwu.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author liudw
 * @date 2021/3/22 9:07
 * @effect  用于程序运行时，控制台输出本类中的图片及文案（需在web.xml中配置该监听器）
 */
public class MyListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println(" ......................我佛慈悲......................");
        System.out.println("                       _oo0oo_                      ");
        System.out.println("                      o8888888o                     ");
        System.out.println("                      88\" . \"88                     ");
        System.out.println("                      (| -_- |)                     ");
        System.out.println("                      0\\  =  /0                     ");
        System.out.println("                    ___/‘---’\\___                   ");
        System.out.println("                  .' \\|       |/ '.                 ");
        System.out.println("                 / \\\\|||  :  |||// \\                ");
        System.out.println("                / _||||| -卍-|||||_ \\               ");
        System.out.println("               |   | \\\\\\  -  /// |   |              ");
        System.out.println("               | \\_|  ''\\---/''  |_/ |              ");
        System.out.println("               \\  .-\\__  '-'  ___/-. /              ");
        System.out.println("             ___'. .'  /--.--\\  '. .'___            ");
        System.out.println("          .\"\" ‘<  ‘.___\\_<|>_/___.’ >’ \"\".          ");
        System.out.println("         | | :  ‘- \\‘.;‘\\ _ /’;.’/ - ’ : | |        ");
        System.out.println("         \\  \\ ‘_.   \\_ __\\ /__ _/   .-’ /  /        ");
        System.out.println("     =====‘-.____‘.___ \\_____/___.-’___.-’=====     ");
        System.out.println("                       ‘=---=’                      ");
        System.out.println("                                                    ");
        System.out.println("....................佛祖开光 ,永无BUG...................");
        System.out.println();
        System.out.println();

        System.out.println("                    .::::.");
        System.out.println("                  .::::::::.");
        System.out.println("                 ::::::::::: ");
        System.out.println("             ..:::::::::::'");
        System.out.println("           '::::::::::::'");
        System.out.println("             .::::::::::");
        System.out.println("        '::::::::::::::..");
        System.out.println("             ..::::::::::::.");
        System.out.println("           ``::::::::::::::::");
        System.out.println("            ::::``:::::::::'        .:::.");
        System.out.println("           ::::'   ':::::'       .::::::::.");
        System.out.println("         .::::'      ::::     .:::::::'::::.");
        System.out.println("        .:::'       :::::  .:::::::::' ':::::.");
        System.out.println("       .::'        :::::.:::::::::'      ':::::.");
        System.out.println("      .::'         ::::::::::::::'         ``::::.");
        System.out.println("  ...:::           ::::::::::::'              ``::.");
        System.out.println(" ```` ':.          ':::::::::'                  ::::..");
        System.out.println("                    '.:::::'                    ':'````..");
        System.out.println("....................妹纸养眼 ,思路上天...................");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
