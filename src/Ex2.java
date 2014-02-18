/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.List;
import javax.microedition.lcdui.TextBox;
import javax.microedition.lcdui.TextField;
import javax.microedition.midlet.*;

/**
 * @author Amina
 */
public class Ex2 extends MIDlet implements CommandListener {
    Display display = Display.getDisplay(this);
     String[] elements={"JAVA","j2ME", "WEB",};
     Image[] tabimgs =new Image[3];

 //list= new List("list des choix",List.MULTIPLE ,elements,tabimgs);
     List list;

     TextBox T1 = new TextBox("T1", null,50, TextField.ANY| TextField.UNEDITABLE);
Command cmd=new Command("OK",Command.OK,0);
 Command cmdBack = new Command("Back", Command.BACK, 0);
 Image img;


    public void startApp() {
        try {
           img = Image.createImage("/1.gif");
            tabimgs[0]=Image.createImage("/1.gif");
            tabimgs[1]=Image.createImage("/1.gif");
            tabimgs[2]=Image.createImage("/1.gif");

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        list= new List("list des choix",List.MULTIPLE ,elements,tabimgs);
        list.append("GL", img);
        list.addCommand(cmd);
        list.setCommandListener(this);
        display.setCurrent(list);

    }

    public void pauseApp() {
    }

    public void destroyApp(boolean unconditional) {

    }

    public void commandAction(Command c ,Displayable d){


    if(c==cmdBack)display.setCurrent(list);
    if(c==cmd)
    {
        String str ="votre choix est \n";
        for(int i=0;i<list.size();i++)
        {
            if(list.isSelected(i))
                str+=list.getString(i)+"\n";

        T1.setString(str);
       display.setCurrent(T1);
    }


    }}}



