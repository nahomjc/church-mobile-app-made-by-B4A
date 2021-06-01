package fullpentecostalchurch.home.blog;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,35);
if (RapidSub.canDelegate("activity_create")) return fullpentecostalchurch.home.blog.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 35;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(4);
 BA.debugLineNum = 37;BA.debugLine="Activity.LoadLayout(\"main1\")";
Debug.ShouldStop(16);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("main1")),main.mostCurrent.activityBA);
 BA.debugLineNum = 39;BA.debugLine="GifViewer1.SetGif(File.DirAssets, \"loading_large.";
Debug.ShouldStop(64);
main.mostCurrent._gifviewer1.runClassMethod (fullpentecostalchurch.home.blog.gifviewer.class, "_setgif",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("loading_large.gif")));
 BA.debugLineNum = 40;BA.debugLine="ToastMessageShow(\"To Begin Click The Start Button";
Debug.ShouldStop(128);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("To Begin Click The Start Button")),(Object)(main.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 42;BA.debugLine="timer1.Initialize(\"timer1\",3000)";
Debug.ShouldStop(512);
main.mostCurrent._timer1.runVoidMethod ("Initialize",main.processBA,(Object)(BA.ObjectToString("timer1")),(Object)(BA.numberCast(long.class, 3000)));
 BA.debugLineNum = 43;BA.debugLine="timer1.Enabled=True";
Debug.ShouldStop(1024);
main.mostCurrent._timer1.runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 44;BA.debugLine="timer2.Initialize(\"timer2\",3000)";
Debug.ShouldStop(2048);
main.mostCurrent._timer2.runVoidMethod ("Initialize",main.processBA,(Object)(BA.ObjectToString("timer2")),(Object)(BA.numberCast(long.class, 3000)));
 BA.debugLineNum = 45;BA.debugLine="timer2.Enabled=True";
Debug.ShouldStop(4096);
main.mostCurrent._timer2.runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 46;BA.debugLine="ImageView2.Visible=True";
Debug.ShouldStop(8192);
main.mostCurrent._imageview2.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 47;BA.debugLine="ImageView2.BringToFront";
Debug.ShouldStop(16384);
main.mostCurrent._imageview2.runVoidMethod ("BringToFront");
 BA.debugLineNum = 48;BA.debugLine="ImageView3.Visible=True";
Debug.ShouldStop(32768);
main.mostCurrent._imageview3.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 49;BA.debugLine="ImageView3.BringToFront";
Debug.ShouldStop(65536);
main.mostCurrent._imageview3.runVoidMethod ("BringToFront");
 BA.debugLineNum = 53;BA.debugLine="GifViewer1.Start";
Debug.ShouldStop(1048576);
main.mostCurrent._gifviewer1.runClassMethod (fullpentecostalchurch.home.blog.gifviewer.class, "_start");
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,64);
if (RapidSub.canDelegate("activity_pause")) return fullpentecostalchurch.home.blog.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 64;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 66;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,57);
if (RapidSub.canDelegate("activity_resume")) return fullpentecostalchurch.home.blog.main.remoteMe.runUserSub(false, "main","activity_resume");
 BA.debugLineNum = 57;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 59;BA.debugLine="GifViewer1.CallFromResume";
Debug.ShouldStop(67108864);
main.mostCurrent._gifviewer1.runClassMethod (fullpentecostalchurch.home.blog.gifviewer.class, "_callfromresume");
 BA.debugLineNum = 62;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button1_click() throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,69);
if (RapidSub.canDelegate("button1_click")) return fullpentecostalchurch.home.blog.main.remoteMe.runUserSub(false, "main","button1_click");
 BA.debugLineNum = 69;BA.debugLine="Sub Button1_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 70;BA.debugLine="StartActivity(main1)";
Debug.ShouldStop(32);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((main.mostCurrent._main1.getObject())));
 BA.debugLineNum = 71;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 25;BA.debugLine="Private Button1 As Button";
main.mostCurrent._button1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private ImageView1 As ImageView";
main.mostCurrent._imageview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private GifViewer1 As GifViewer";
main.mostCurrent._gifviewer1 = RemoteObject.createNew ("fullpentecostalchurch.home.blog.gifviewer");
 //BA.debugLineNum = 28;BA.debugLine="Dim timer1 As Timer";
main.mostCurrent._timer1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
 //BA.debugLineNum = 29;BA.debugLine="Dim timer2 As Timer";
main.mostCurrent._timer2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
 //BA.debugLineNum = 31;BA.debugLine="Private ImageView2 As ImageView";
main.mostCurrent._imageview2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private ImageView3 As ImageView";
main.mostCurrent._imageview3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
main1_subs_0._process_globals();
chat_subs_0._process_globals();
currency_subs_0._process_globals();
facebook_subs_0._process_globals();
youtube_subs_0._process_globals();
mission_subs_0._process_globals();
news_subs_0._process_globals();
note_subs_0._process_globals();
prayer_subs_0._process_globals();
map_subs_0._process_globals();
donate_subs_0._process_globals();
email_subs_0._process_globals();
starter_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("fullpentecostalchurch.home.blog.main");
main1.myClass = BA.getDeviceClass ("fullpentecostalchurch.home.blog.main1");
arcmenu.myClass = BA.getDeviceClass ("fullpentecostalchurch.home.blog.arcmenu");
arcmenu2.myClass = BA.getDeviceClass ("fullpentecostalchurch.home.blog.arcmenu2");
slidemenu.myClass = BA.getDeviceClass ("fullpentecostalchurch.home.blog.slidemenu");
chat.myClass = BA.getDeviceClass ("fullpentecostalchurch.home.blog.chat");
currency.myClass = BA.getDeviceClass ("fullpentecostalchurch.home.blog.currency");
facebook.myClass = BA.getDeviceClass ("fullpentecostalchurch.home.blog.facebook");
youtube.myClass = BA.getDeviceClass ("fullpentecostalchurch.home.blog.youtube");
mission.myClass = BA.getDeviceClass ("fullpentecostalchurch.home.blog.mission");
news.myClass = BA.getDeviceClass ("fullpentecostalchurch.home.blog.news");
note.myClass = BA.getDeviceClass ("fullpentecostalchurch.home.blog.note");
prayer.myClass = BA.getDeviceClass ("fullpentecostalchurch.home.blog.prayer");
map.myClass = BA.getDeviceClass ("fullpentecostalchurch.home.blog.map");
donate.myClass = BA.getDeviceClass ("fullpentecostalchurch.home.blog.donate");
email.myClass = BA.getDeviceClass ("fullpentecostalchurch.home.blog.email");
starter.myClass = BA.getDeviceClass ("fullpentecostalchurch.home.blog.starter");
gifviewer.myClass = BA.getDeviceClass ("fullpentecostalchurch.home.blog.gifviewer");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 18;BA.debugLine="Public GifsCache As Map";
main._gifscache = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _timer1_tick() throws Exception{
try {
		Debug.PushSubsStack("timer1_Tick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,73);
if (RapidSub.canDelegate("timer1_tick")) return fullpentecostalchurch.home.blog.main.remoteMe.runUserSub(false, "main","timer1_tick");
 BA.debugLineNum = 73;BA.debugLine="Sub timer1_Tick";
Debug.ShouldStop(256);
 BA.debugLineNum = 74;BA.debugLine="ImageView2.Visible=False";
Debug.ShouldStop(512);
main.mostCurrent._imageview2.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 75;BA.debugLine="timer1.Enabled=False";
Debug.ShouldStop(1024);
main.mostCurrent._timer1.runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 76;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _timer2_tick() throws Exception{
try {
		Debug.PushSubsStack("timer2_Tick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,77);
if (RapidSub.canDelegate("timer2_tick")) return fullpentecostalchurch.home.blog.main.remoteMe.runUserSub(false, "main","timer2_tick");
 BA.debugLineNum = 77;BA.debugLine="Sub timer2_Tick";
Debug.ShouldStop(4096);
 BA.debugLineNum = 78;BA.debugLine="ImageView3.Visible=False";
Debug.ShouldStop(8192);
main.mostCurrent._imageview3.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 79;BA.debugLine="timer2.Enabled=False";
Debug.ShouldStop(16384);
main.mostCurrent._timer2.runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 80;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}