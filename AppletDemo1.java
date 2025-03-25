import java.applet.*;
import java.awt.*;

/*<applet code="AppletDemo1.class"width="300"height="300">
</applet>*/
public class AppletDemo1 extends Applet
{
public void paint(Graphics g)
{
g.drawString("Hello World!",100,150);
g.drawLine(150,300,250,300);
g.drawLine(170,350,170,550);
g.setColor(Color.PINK);
g.drawRect(200,400,300,100);
g.setColor(Color.YELLOW);
g.fillOval(50,50,70,70);
g.drawOval(50,50,70,70);
}
}

