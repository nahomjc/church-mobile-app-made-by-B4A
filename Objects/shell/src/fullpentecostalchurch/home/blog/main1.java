
package fullpentecostalchurch.home.blog;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class main1 implements IRemote{
	public static main1 mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public main1() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
	public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("main1"), "fullpentecostalchurch.home.blog.main1");
	}

public boolean isSingleton() {
		return true;
	}
     public static RemoteObject getObject() {
		return myClass;
	 }

	public RemoteObject activityBA;
	public RemoteObject _activity;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
		activityBA = (RemoteObject) args[2];
		_activity = (RemoteObject) args[3];
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[4];
        remoteMe = (RemoteObject) args[5];
		pcBA = new PCBA(this, main1.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _imageview1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _dummy = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _menu = RemoteObject.declareNull("fullpentecostalchurch.home.blog.arcmenu");
public static RemoteObject _menu2 = RemoteObject.declareNull("fullpentecostalchurch.home.blog.arcmenu2");
public static RemoteObject _buttoninfo = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _sm = RemoteObject.declareNull("fullpentecostalchurch.home.blog.slidemenu");
public static RemoteObject _spotlightmenu = RemoteObject.declareNull("b4a.example.spotlight");
public static RemoteObject _fpc = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _button2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _button1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _listsiz = RemoteObject.declareNull("anywheresoftware.b4a.objects.ListViewWrapper");
public static RemoteObject _comserv = RemoteObject.createImmutable("");
public static RemoteObject _webview1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.WebViewWrapper");
public static RemoteObject _listview1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ListViewWrapper");
public static fullpentecostalchurch.home.blog.main _main = null;
public static fullpentecostalchurch.home.blog.chat _chat = null;
public static fullpentecostalchurch.home.blog.currency _currency = null;
public static fullpentecostalchurch.home.blog.facebook _facebook = null;
public static fullpentecostalchurch.home.blog.youtube _youtube = null;
public static fullpentecostalchurch.home.blog.mission _mission = null;
public static fullpentecostalchurch.home.blog.news _news = null;
public static fullpentecostalchurch.home.blog.note _note = null;
public static fullpentecostalchurch.home.blog.prayer _prayer = null;
public static fullpentecostalchurch.home.blog.map _map = null;
public static fullpentecostalchurch.home.blog.donate _donate = null;
public static fullpentecostalchurch.home.blog.email _email = null;
public static fullpentecostalchurch.home.blog.starter _starter = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",main1.mostCurrent._activity,"Button1",main1.mostCurrent._button1,"Button2",main1.mostCurrent._button2,"Buttoninfo",main1.mostCurrent._buttoninfo,"chat",Debug.moduleToString(fullpentecostalchurch.home.blog.chat.class),"ComServ",main1.mostCurrent._comserv,"currency",Debug.moduleToString(fullpentecostalchurch.home.blog.currency.class),"donate",Debug.moduleToString(fullpentecostalchurch.home.blog.donate.class),"dummy",main1.mostCurrent._dummy,"email",Debug.moduleToString(fullpentecostalchurch.home.blog.email.class),"facebook",Debug.moduleToString(fullpentecostalchurch.home.blog.facebook.class),"FPC",main1.mostCurrent._fpc,"ImageView1",main1.mostCurrent._imageview1,"listsiz",main1.mostCurrent._listsiz,"ListView1",main1.mostCurrent._listview1,"Main",Debug.moduleToString(fullpentecostalchurch.home.blog.main.class),"map",Debug.moduleToString(fullpentecostalchurch.home.blog.map.class),"menu",main1.mostCurrent._menu,"menu2",main1.mostCurrent._menu2,"mission",Debug.moduleToString(fullpentecostalchurch.home.blog.mission.class),"news",Debug.moduleToString(fullpentecostalchurch.home.blog.news.class),"note",Debug.moduleToString(fullpentecostalchurch.home.blog.note.class),"prayer",Debug.moduleToString(fullpentecostalchurch.home.blog.prayer.class),"sm",main1.mostCurrent._sm,"Spotlightmenu",main1.mostCurrent._spotlightmenu,"Starter",Debug.moduleToString(fullpentecostalchurch.home.blog.starter.class),"WebView1",main1.mostCurrent._webview1,"youtube",Debug.moduleToString(fullpentecostalchurch.home.blog.youtube.class)};
}
}