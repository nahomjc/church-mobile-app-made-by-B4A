package fullpentecostalchurch.home.blog;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class note_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (note) ","note",11,note.mostCurrent.activityBA,note.mostCurrent,24);
if (RapidSub.canDelegate("activity_create")) return fullpentecostalchurch.home.blog.note.remoteMe.runUserSub(false, "note","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 24;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 26;BA.debugLine="Activity.LoadLayout(\"note\")";
Debug.ShouldStop(33554432);
note.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("note")),note.mostCurrent.activityBA);
 BA.debugLineNum = 27;BA.debugLine="WebView1.LoadUrl(\"https://www.calmlywriter.com/on";
Debug.ShouldStop(67108864);
note.mostCurrent._webview1.runVoidMethod ("LoadUrl",(Object)(RemoteObject.createImmutable("https://www.calmlywriter.com/online/")));
 BA.debugLineNum = 30;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("Activity_Pause (note) ","note",11,note.mostCurrent.activityBA,note.mostCurrent,36);
if (RapidSub.canDelegate("activity_pause")) return fullpentecostalchurch.home.blog.note.remoteMe.runUserSub(false, "note","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 36;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(8);
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("Activity_Resume (note) ","note",11,note.mostCurrent.activityBA,note.mostCurrent,32);
if (RapidSub.canDelegate("activity_resume")) return fullpentecostalchurch.home.blog.note.remoteMe.runUserSub(false, "note","activity_resume");
 BA.debugLineNum = 32;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 34;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("Button1_Click (note) ","note",11,note.mostCurrent.activityBA,note.mostCurrent,41);
if (RapidSub.canDelegate("button1_click")) return fullpentecostalchurch.home.blog.note.remoteMe.runUserSub(false, "note","button1_click");
 BA.debugLineNum = 41;BA.debugLine="Sub Button1_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 42;BA.debugLine="StartActivity(main1)";
Debug.ShouldStop(512);
note.mostCurrent.__c.runVoidMethod ("StartActivity",note.processBA,(Object)((note.mostCurrent._main1.getObject())));
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
 //BA.debugLineNum = 16;BA.debugLine="Private WebView1 As WebView";
note.mostCurrent._webview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private Button1 As Button";
note.mostCurrent._button1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private ListView1 As ListView";
note.mostCurrent._listview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private Button2 As Button";
note.mostCurrent._button2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Dim Urlrefersh As String";
note.mostCurrent._urlrefersh = RemoteObject.createImmutable("");
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}