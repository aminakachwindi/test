/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.List;
import javax.microedition.lcdui.TextBox;
import javax.microedition.lcdui.TextField;
import javax.microedition.midlet.*;

/**
 * @author Amina
 */
public class Listchoix extends MIDlet implements CommandListener{
    Display display = Display.getDisplay(this);
    String[] elements={"choix1","choix2"};

    List list = new List("list des choix",List.IMPLICIT,elements,null);
    Command cmd=new Command("OK",Command.OK,0);

    TextBox T1 = new TextBox("T1", null, 20, TextField.ANY);
    TextBox T2= new TextBox("T2", null, 20, TextField.ANY);
    Command cmdBack = new Command("Back", Command.BACK, 0);



    public void startApp() {
        
    
        display.setCurrent(list);
        
        list.addCommand(cmd);
        T1.addCommand(cmdBack);
        T1.setCommandListener(this);
        list.setCommandListener(this);


    }

    public void pauseApp() {
    }

    public void destroyApp(boolean unconditional) {
    }
     public void commandAction(Command c ,Displayable d){
//              if(c==List.SELECT_COMMAND)
//    {        System.out.println(list.getSelectedIndex());
//        System.out.println(list.getString(list.getSelectedIndex()));
//    }
//
////        on utilise le traitement précédente dans list.IMPLICIT
//        if(c==cmd)
//        {   System.out.println(list.getSelectedIndex());
//        System.out.println(list.getString(list.getSelectedIndex()));
//
//        }

         //on l'utilise avec EXCLUSIVE

          if(c==cmd)
        {
            if(list.getSelectedIndex()==0)
            {
                T1.setString(list.getString(0));
                display.setCurrent(T1);
            }
            if(list.getSelectedIndex()==1)
            {
                T1.setString(list.getString(1));
                display.setCurrent(T1);
            }
        }
        if(c==cmdBack)display.setCurrent(list);
        }
//
    }




