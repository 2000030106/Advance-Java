package listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.*;

@WebListener
public class AppListener
implements ServletContextListener {

public void contextInitialized(
    ServletContextEvent sce) {

    System.out.println(
        "Application Started");
}

public void contextDestroyed(
    ServletContextEvent sce) {

    System.out.println(
        "Application Stopped");
}

}