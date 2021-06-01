package fullpentecostalchurch.home.blog;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class email_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (email) ","email",15,email.mostCurrent.activityBA,email.mostCurrent,20);
if (RapidSub.canDelegate("activity_create")) return fullpentecostalchurch.home.blog.email.remoteMe.runUserSub(false, "email","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 20;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 22;BA.debugLine="Activity.LoadLayout(\"email\")";
Debug.ShouldStop(2097152);
email.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("email")),email.mostCurrent.activityBA);
 BA.debugLineNum = 23;BA.debugLine="WebView1.LoadUrl(\"https://accounts.google.com/Ser";
Debug.ShouldStop(4194304);
email.mostCurrent._webview1.runVoidMethod ("LoadUrl",(Object)(RemoteObject.createImmutable("https://accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession")));
 BA.debugLineNum = 25;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("Activity_Pause (email) ","email",15,email.mostCurrent.activityBA,email.mostCurrent,31);
if (RapidSub.canDelegate("activity_pause")) return fullpentecostalchurch.home.blog.email.remoteMe.runUserSub(false, "email","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 31;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (email) ","email",15,email.mostCurrent.activityBA,email.mostCurrent,27);
if (RapidSub.canDelegate("activity_resume")) return fullpentecostalchurch.home.blog.email.remoteMe.runUserSub(false, "email","activity_resume");
 BA.debugLineNum = 27;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(67108864);
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
public static RemoteObject  _button1_click() throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (email) ","email",15,email.mostCurrent.activityBA,email.mostCurrent,36);
if (RapidSub.canDelegate("button1_click")) return fullpentecostalchurch.home.blog.email.remoteMe.runUserSub(false, "email","button1_click");
 BA.debugLineNum = 36;BA.debugLine="Sub Button1_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 37;BA.debugLine="StartActivity(main1)";
Debug.ShouldStop(16);
email.mostCurrent.__c.runVoidMethod ("StartActivity",email.processBA,(Object)((email.mostCurrent._main1.getObject())));
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Private WebView1 As WebView";
email.mostCurrent._webview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private Button1 As Button";
email.mostCurrent._button1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}