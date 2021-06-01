package fullpentecostalchurch.home.blog;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class chat_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (chat) ","chat",5,chat.mostCurrent.activityBA,chat.mostCurrent,24);
if (RapidSub.canDelegate("activity_create")) return fullpentecostalchurch.home.blog.chat.remoteMe.runUserSub(false, "chat","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 24;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 27;BA.debugLine="Activity.LoadLayout(\"facebook\")";
Debug.ShouldStop(67108864);
chat.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("facebook")),chat.mostCurrent.activityBA);
 BA.debugLineNum = 28;BA.debugLine="WebView1.LoadUrl(\"https://fullpentecostalchurch.h";
Debug.ShouldStop(134217728);
chat.mostCurrent._webview1.runVoidMethod ("LoadUrl",(Object)(RemoteObject.createImmutable("https://fullpentecostalchurch.home.blog/2019/09/20/chat-with-the-man-of-god-and-get-biblical-answer/")));
 BA.debugLineNum = 29;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("Activity_Pause (chat) ","chat",5,chat.mostCurrent.activityBA,chat.mostCurrent,35);
if (RapidSub.canDelegate("activity_pause")) return fullpentecostalchurch.home.blog.chat.remoteMe.runUserSub(false, "chat","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 35;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(4);
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("Activity_Resume (chat) ","chat",5,chat.mostCurrent.activityBA,chat.mostCurrent,31);
if (RapidSub.canDelegate("activity_resume")) return fullpentecostalchurch.home.blog.chat.remoteMe.runUserSub(false, "chat","activity_resume");
 BA.debugLineNum = 31;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("Button1_Click (chat) ","chat",5,chat.mostCurrent.activityBA,chat.mostCurrent,40);
if (RapidSub.canDelegate("button1_click")) return fullpentecostalchurch.home.blog.chat.remoteMe.runUserSub(false, "chat","button1_click");
 BA.debugLineNum = 40;BA.debugLine="Sub Button1_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 41;BA.debugLine="StartActivity(main1)";
Debug.ShouldStop(256);
chat.mostCurrent.__c.runVoidMethod ("StartActivity",chat.processBA,(Object)((chat.mostCurrent._main1.getObject())));
 BA.debugLineNum = 42;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button2_click() throws Exception{
try {
		Debug.PushSubsStack("Button2_Click (chat) ","chat",5,chat.mostCurrent.activityBA,chat.mostCurrent,45);
if (RapidSub.canDelegate("button2_click")) return fullpentecostalchurch.home.blog.chat.remoteMe.runUserSub(false, "chat","button2_click");
 BA.debugLineNum = 45;BA.debugLine="Sub Button2_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 46;BA.debugLine="WebView1.LoadUrl(\"https://fullpentecostalchurch.h";
Debug.ShouldStop(8192);
chat.mostCurrent._webview1.runVoidMethod ("LoadUrl",(Object)(RemoteObject.createImmutable("https://fullpentecostalchurch.home.blog/2019/09/20/chat-with-the-man-of-god-and-get-biblical-answer/")));
 BA.debugLineNum = 47;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button3_click() throws Exception{
try {
		Debug.PushSubsStack("Button3_Click (chat) ","chat",5,chat.mostCurrent.activityBA,chat.mostCurrent,50);
if (RapidSub.canDelegate("button3_click")) return fullpentecostalchurch.home.blog.chat.remoteMe.runUserSub(false, "chat","button3_click");
 BA.debugLineNum = 50;BA.debugLine="Sub Button3_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 51;BA.debugLine="WebView1.Back";
Debug.ShouldStop(262144);
chat.mostCurrent._webview1.runVoidMethod ("Back");
 BA.debugLineNum = 52;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button4_click() throws Exception{
try {
		Debug.PushSubsStack("Button4_Click (chat) ","chat",5,chat.mostCurrent.activityBA,chat.mostCurrent,54);
if (RapidSub.canDelegate("button4_click")) return fullpentecostalchurch.home.blog.chat.remoteMe.runUserSub(false, "chat","button4_click");
 BA.debugLineNum = 54;BA.debugLine="Sub Button4_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 55;BA.debugLine="WebView1.Forward";
Debug.ShouldStop(4194304);
chat.mostCurrent._webview1.runVoidMethod ("Forward");
 BA.debugLineNum = 56;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 15;BA.debugLine="Private WebView1 As WebView";
chat.mostCurrent._webview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 16;BA.debugLine="Private Button1 As Button";
chat.mostCurrent._button1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private Button2 As Button";
chat.mostCurrent._button2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Dim Urlrefersh As String";
chat.mostCurrent._urlrefersh = RemoteObject.createImmutable("");
 //BA.debugLineNum = 20;BA.debugLine="Private Button3 As Button";
chat.mostCurrent._button3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private Button4 As Button";
chat.mostCurrent._button4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}