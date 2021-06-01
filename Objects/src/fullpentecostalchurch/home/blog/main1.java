package fullpentecostalchurch.home.blog;


import anywheresoftware.b4a.B4AMenuItem;
import android.app.Activity;
import android.os.Bundle;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.B4AActivity;
import anywheresoftware.b4a.ObjectWrapper;
import anywheresoftware.b4a.objects.ActivityWrapper;
import java.lang.reflect.InvocationTargetException;
import anywheresoftware.b4a.B4AUncaughtException;
import anywheresoftware.b4a.debug.*;
import java.lang.ref.WeakReference;

public class main1 extends Activity implements B4AActivity{
	public static main1 mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = false;
	public static final boolean includeTitle = true;
    public static WeakReference<Activity> previousOne;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        mostCurrent = this;
		if (processBA == null) {
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "fullpentecostalchurch.home.blog", "fullpentecostalchurch.home.blog.main1");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (main1).");
				p.finish();
			}
		}
        processBA.setActivityPaused(true);
        processBA.runHook("oncreate", this, null);
		if (!includeTitle) {
        	this.getWindow().requestFeature(android.view.Window.FEATURE_NO_TITLE);
        }
        if (fullScreen) {
        	getWindow().setFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN,   
        			android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
		
        processBA.sharedProcessBA.activityBA = null;
		layout = new BALayout(this);
		setContentView(layout);
		afterFirstLayout = false;
        WaitForLayout wl = new WaitForLayout();
        if (anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startFromActivity(processBA, wl, false))
		    BA.handler.postDelayed(wl, 5);

	}
	static class WaitForLayout implements Runnable {
		public void run() {
			if (afterFirstLayout)
				return;
			if (mostCurrent == null)
				return;
            
			if (mostCurrent.layout.getWidth() == 0) {
				BA.handler.postDelayed(this, 5);
				return;
			}
			mostCurrent.layout.getLayoutParams().height = mostCurrent.layout.getHeight();
			mostCurrent.layout.getLayoutParams().width = mostCurrent.layout.getWidth();
			afterFirstLayout = true;
			mostCurrent.afterFirstLayout();
		}
	}
	private void afterFirstLayout() {
        if (this != mostCurrent)
			return;
		activityBA = new BA(this, layout, processBA, "fullpentecostalchurch.home.blog", "fullpentecostalchurch.home.blog.main1");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "fullpentecostalchurch.home.blog.main1", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (main1) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (main1) Resume **");
        processBA.raiseEvent(null, "activity_resume");
        if (android.os.Build.VERSION.SDK_INT >= 11) {
			try {
				android.app.Activity.class.getMethod("invalidateOptionsMenu").invoke(this,(Object[]) null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	public void addMenuItem(B4AMenuItem item) {
		if (menuItems == null)
			menuItems = new java.util.ArrayList<B4AMenuItem>();
		menuItems.add(item);
	}
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		super.onCreateOptionsMenu(menu);
        try {
            if (processBA.subExists("activity_actionbarhomeclick")) {
                Class.forName("android.app.ActionBar").getMethod("setHomeButtonEnabled", boolean.class).invoke(
                    getClass().getMethod("getActionBar").invoke(this), true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (processBA.runHook("oncreateoptionsmenu", this, new Object[] {menu}))
            return true;
		if (menuItems == null)
			return false;
		for (B4AMenuItem bmi : menuItems) {
			android.view.MenuItem mi = menu.add(bmi.title);
			if (bmi.drawable != null)
				mi.setIcon(bmi.drawable);
            if (android.os.Build.VERSION.SDK_INT >= 11) {
				try {
                    if (bmi.addToBar) {
				        android.view.MenuItem.class.getMethod("setShowAsAction", int.class).invoke(mi, 1);
                    }
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			mi.setOnMenuItemClickListener(new B4AMenuItemsClickListener(bmi.eventName.toLowerCase(BA.cul)));
		}
        
		return true;
	}   
 @Override
 public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (item.getItemId() == 16908332) {
        processBA.raiseEvent(null, "activity_actionbarhomeclick");
        return true;
    }
    else
        return super.onOptionsItemSelected(item); 
}
@Override
 public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    processBA.runHook("onprepareoptionsmenu", this, new Object[] {menu});
    return true;
    
 }
 protected void onStart() {
    super.onStart();
    processBA.runHook("onstart", this, null);
}
 protected void onStop() {
    super.onStop();
    processBA.runHook("onstop", this, null);
}
    public void onWindowFocusChanged(boolean hasFocus) {
       super.onWindowFocusChanged(hasFocus);
       if (processBA.subExists("activity_windowfocuschanged"))
           processBA.raiseEvent2(null, true, "activity_windowfocuschanged", false, hasFocus);
    }
	private class B4AMenuItemsClickListener implements android.view.MenuItem.OnMenuItemClickListener {
		private final String eventName;
		public B4AMenuItemsClickListener(String eventName) {
			this.eventName = eventName;
		}
		public boolean onMenuItemClick(android.view.MenuItem item) {
			processBA.raiseEventFromUI(item.getTitle(), eventName + "_click");
			return true;
		}
	}
    public static Class<?> getObject() {
		return main1.class;
	}
    private Boolean onKeySubExist = null;
    private Boolean onKeyUpSubExist = null;
	@Override
	public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeydown", this, new Object[] {keyCode, event}))
            return true;
		if (onKeySubExist == null)
			onKeySubExist = processBA.subExists("activity_keypress");
		if (onKeySubExist) {
			if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK &&
					android.os.Build.VERSION.SDK_INT >= 18) {
				HandleKeyDelayed hk = new HandleKeyDelayed();
				hk.kc = keyCode;
				BA.handler.post(hk);
				return true;
			}
			else {
				boolean res = new HandleKeyDelayed().runDirectly(keyCode);
				if (res)
					return true;
			}
		}
		return super.onKeyDown(keyCode, event);
	}
	private class HandleKeyDelayed implements Runnable {
		int kc;
		public void run() {
			runDirectly(kc);
		}
		public boolean runDirectly(int keyCode) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keypress", false, keyCode);
			if (res == null || res == true) {
                return true;
            }
            else if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK) {
				finish();
				return true;
			}
            return false;
		}
		
	}
    @Override
	public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeyup", this, new Object[] {keyCode, event}))
            return true;
		if (onKeyUpSubExist == null)
			onKeyUpSubExist = processBA.subExists("activity_keyup");
		if (onKeyUpSubExist) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keyup", false, keyCode);
			if (res == null || res == true)
				return true;
		}
		return super.onKeyUp(keyCode, event);
	}
	@Override
	public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
		this.setIntent(intent);
        processBA.runHook("onnewintent", this, new Object[] {intent});
	}
    @Override 
	public void onPause() {
		super.onPause();
        if (_activity == null)
            return;
        if (this != mostCurrent)
			return;
		anywheresoftware.b4a.Msgbox.dismiss(true);
        BA.LogInfo("** Activity (main1) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        if (mostCurrent != null)
            processBA.raiseEvent2(_activity, true, "activity_pause", false, activityBA.activity.isFinishing());		
        processBA.setActivityPaused(true);
        mostCurrent = null;
        if (!activityBA.activity.isFinishing())
			previousOne = new WeakReference<Activity>(this);
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        processBA.runHook("onpause", this, null);
	}

	@Override
	public void onDestroy() {
        super.onDestroy();
		previousOne = null;
        processBA.runHook("ondestroy", this, null);
	}
    @Override 
	public void onResume() {
		super.onResume();
        mostCurrent = this;
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (activityBA != null) { //will be null during activity create (which waits for AfterLayout).
        	ResumeMessage rm = new ResumeMessage(mostCurrent);
        	BA.handler.post(rm);
        }
        processBA.runHook("onresume", this, null);
	}
    private static class ResumeMessage implements Runnable {
    	private final WeakReference<Activity> activity;
    	public ResumeMessage(Activity activity) {
    		this.activity = new WeakReference<Activity>(activity);
    	}
		public void run() {
			if (mostCurrent == null || mostCurrent != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (main1) Resume **");
		    processBA.raiseEvent(mostCurrent._activity, "activity_resume", (Object[])null);
		}
    }
	@Override
	protected void onActivityResult(int requestCode, int resultCode,
	      android.content.Intent data) {
		processBA.onActivityResult(requestCode, resultCode, data);
        processBA.runHook("onactivityresult", this, new Object[] {requestCode, resultCode});
	}
	private static void initializeGlobals() {
		processBA.raiseEvent2(null, true, "globals", false, (Object[])null);
	}
    public void onRequestPermissionsResult(int requestCode,
        String permissions[], int[] grantResults) {
        for (int i = 0;i < permissions.length;i++) {
            Object[] o = new Object[] {permissions[i], grantResults[i] == 0};
            processBA.raiseEventFromDifferentThread(null,null, 0, "activity_permissionresult", true, o);
        }
            
    }



public static void initializeProcessGlobals() {
             try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
}
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _dummy = null;
public fullpentecostalchurch.home.blog.arcmenu _menu = null;
public fullpentecostalchurch.home.blog.arcmenu2 _menu2 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttoninfo = null;
public fullpentecostalchurch.home.blog.slidemenu _sm = null;
public b4a.example.spotlight _spotlightmenu = null;
public anywheresoftware.b4a.objects.ButtonWrapper _fpc = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button2 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button1 = null;
public anywheresoftware.b4a.objects.ListViewWrapper _listsiz = null;
public static String _comserv = "";
public anywheresoftware.b4a.objects.WebViewWrapper _webview1 = null;
public anywheresoftware.b4a.objects.ListViewWrapper _listview1 = null;
public fullpentecostalchurch.home.blog.main _main = null;
public fullpentecostalchurch.home.blog.chat _chat = null;
public fullpentecostalchurch.home.blog.currency _currency = null;
public fullpentecostalchurch.home.blog.facebook _facebook = null;
public fullpentecostalchurch.home.blog.youtube _youtube = null;
public fullpentecostalchurch.home.blog.mission _mission = null;
public fullpentecostalchurch.home.blog.news _news = null;
public fullpentecostalchurch.home.blog.note _note = null;
public fullpentecostalchurch.home.blog.prayer _prayer = null;
public fullpentecostalchurch.home.blog.map _map = null;
public fullpentecostalchurch.home.blog.donate _donate = null;
public fullpentecostalchurch.home.blog.email _email = null;
public fullpentecostalchurch.home.blog.starter _starter = null;
public static String  _abpop_closed() throws Exception{
RDebugUtils.currentModule="main1";
if (Debug.shouldDelegate(mostCurrent.activityBA, "abpop_closed"))
	return (String) Debug.delegate(mostCurrent.activityBA, "abpop_closed", null);
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Sub ABPop_Closed";
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="dummy.RemoveView";
mostCurrent._dummy.RemoveView();
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="End Sub";
return "";
}
public static String  _abpop_itemclicked(de.amberhome.actionbarhelper.MenuItemWrapper _item) throws Exception{
RDebugUtils.currentModule="main1";
if (Debug.shouldDelegate(mostCurrent.activityBA, "abpop_itemclicked"))
	return (String) Debug.delegate(mostCurrent.activityBA, "abpop_itemclicked", new Object[] {_item});
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Sub ABPop_ItemClicked (Item As MenuItem)";
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="PopupMenu_ItemClicked(Item)";
_popupmenu_itemclicked(_item);
RDebugUtils.currentLine=1507331;
 //BA.debugLineNum = 1507331;BA.debugLine="End Sub";
return "";
}
public static String  _popupmenu_itemclicked(de.amberhome.actionbarhelper.MenuItemWrapper _item) throws Exception{
RDebugUtils.currentModule="main1";
if (Debug.shouldDelegate(mostCurrent.activityBA, "popupmenu_itemclicked"))
	return (String) Debug.delegate(mostCurrent.activityBA, "popupmenu_itemclicked", new Object[] {_item});
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Sub PopupMenu_ItemClicked (Item As MenuItem)";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="MsgboxAsync(\"📱Version 1.0";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("📱Version 1.0                                   🛂Developed by Nahom Tesfaye                                  📞For More Info Call 0960148453                                                        ⛪Full Pentecostal church app is all about helping Children's of GOD to have deep relationship with Jesus and Assisting Christian's to Grow in the knowledge of Christ🙏"),BA.ObjectToCharSequence("About us👨"),processBA);
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="End Sub";
return "";
}
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="main1";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime});
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=1048583;
 //BA.debugLineNum = 1048583;BA.debugLine="Activity.LoadLayout(\"Main\")";
mostCurrent._activity.LoadLayout("Main",mostCurrent.activityBA);
RDebugUtils.currentLine=1048585;
 //BA.debugLineNum = 1048585;BA.debugLine="Activity.Title = \"Full Pentecostal Church\"";
mostCurrent._activity.setTitle(BA.ObjectToCharSequence("Full Pentecostal Church"));
RDebugUtils.currentLine=1048587;
 //BA.debugLineNum = 1048587;BA.debugLine="ListView1.Visible=False";
mostCurrent._listview1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1048588;
 //BA.debugLineNum = 1048588;BA.debugLine="ListView1.AddSingleLine(\" help\")";
mostCurrent._listview1.AddSingleLine(BA.ObjectToCharSequence(" help"));
RDebugUtils.currentLine=1048589;
 //BA.debugLineNum = 1048589;BA.debugLine="ListView1.AddSingleLine(\" help\")";
mostCurrent._listview1.AddSingleLine(BA.ObjectToCharSequence(" help"));
RDebugUtils.currentLine=1048590;
 //BA.debugLineNum = 1048590;BA.debugLine="ListView1.AddSingleLine(\" help\")";
mostCurrent._listview1.AddSingleLine(BA.ObjectToCharSequence(" help"));
RDebugUtils.currentLine=1048591;
 //BA.debugLineNum = 1048591;BA.debugLine="ListView1.SingleLineLayout.Label.Text=Colors.RGB(";
mostCurrent._listview1.getSingleLineLayout().Label.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (38),(int) (50),(int) (56))));
RDebugUtils.currentLine=1048592;
 //BA.debugLineNum = 1048592;BA.debugLine="ListView1.SingleLineLayout.Label.TextSize=14";
mostCurrent._listview1.getSingleLineLayout().Label.setTextSize((float) (14));
RDebugUtils.currentLine=1048593;
 //BA.debugLineNum = 1048593;BA.debugLine="ListView1.SingleLineLayout.ItemHeight=35dip";
mostCurrent._listview1.getSingleLineLayout().setItemHeight(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (35)));
RDebugUtils.currentLine=1048594;
 //BA.debugLineNum = 1048594;BA.debugLine="listsiz.Initialize(\"\")";
mostCurrent._listsiz.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=1048595;
 //BA.debugLineNum = 1048595;BA.debugLine="listsiz.SetLayout(ListView1.Left,ListView1.Top,Li";
mostCurrent._listsiz.SetLayout(mostCurrent._listview1.getLeft(),mostCurrent._listview1.getTop(),mostCurrent._listview1.getWidth(),(int) (mostCurrent._listview1.getSingleLineLayout().getItemHeight()*4));
RDebugUtils.currentLine=1048597;
 //BA.debugLineNum = 1048597;BA.debugLine="ListView1.SetLayout(100%x,0%y,0dip,0dip)";
mostCurrent._listview1.SetLayout(anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (0),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)));
RDebugUtils.currentLine=1048598;
 //BA.debugLineNum = 1048598;BA.debugLine="Activity.AddMenuItem3(\"📚\", \"Menu\", Null, True)";
mostCurrent._activity.AddMenuItem3(BA.ObjectToCharSequence("📚"),"Menu",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1048600;
 //BA.debugLineNum = 1048600;BA.debugLine="menu.Initialize(Activity,Me, \"ArcMenu\",LoadBitmap";
mostCurrent._menu._initialize(null,mostCurrent.activityBA,mostCurrent._activity,main1.getObject(),"ArcMenu",anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"plus11.png"),anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"menu23.png"),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (93),mostCurrent.activityBA));
RDebugUtils.currentLine=1048602;
 //BA.debugLineNum = 1048602;BA.debugLine="menu.SetDegreeSpan(90)";
mostCurrent._menu._setdegreespan(null,(int) (90));
RDebugUtils.currentLine=1048603;
 //BA.debugLineNum = 1048603;BA.debugLine="menu.SetMenuItemRadius(40%x)";
mostCurrent._menu._setmenuitemradius(null,anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (40),mostCurrent.activityBA));
RDebugUtils.currentLine=1048604;
 //BA.debugLineNum = 1048604;BA.debugLine="menu.AddItem(LoadBitmap(File.DirAssets, \"circle-c";
mostCurrent._menu._additem(null,anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"circle-cropped(9).png"));
RDebugUtils.currentLine=1048605;
 //BA.debugLineNum = 1048605;BA.debugLine="menu.AddItem(LoadBitmap(File.DirAssets, \"circle-c";
mostCurrent._menu._additem(null,anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"circle-cropped(6).png"));
RDebugUtils.currentLine=1048606;
 //BA.debugLineNum = 1048606;BA.debugLine="menu.AddItem(LoadBitmap(File.DirAssets, \"circle-c";
mostCurrent._menu._additem(null,anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"circle-cropped(5).png"));
RDebugUtils.currentLine=1048607;
 //BA.debugLineNum = 1048607;BA.debugLine="menu.AddItem(LoadBitmap(File.DirAssets, \"not1.png";
mostCurrent._menu._additem(null,anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"not1.png"));
RDebugUtils.currentLine=1048610;
 //BA.debugLineNum = 1048610;BA.debugLine="menu2.Initialize(Activity,Me, \"ArcMenu2\",LoadBitm";
mostCurrent._menu2._initialize(null,mostCurrent.activityBA,mostCurrent._activity,main1.getObject(),"ArcMenu2",anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"circle-cropped(2).png"),anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"menu23.png"),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (50),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (12),mostCurrent.activityBA));
RDebugUtils.currentLine=1048612;
 //BA.debugLineNum = 1048612;BA.debugLine="menu2.SetDegreeSpan(180)";
mostCurrent._menu2._setdegreespan(null,(int) (180));
RDebugUtils.currentLine=1048613;
 //BA.debugLineNum = 1048613;BA.debugLine="menu2.SetMenuItemRadius(30%x)";
mostCurrent._menu2._setmenuitemradius(null,anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (30),mostCurrent.activityBA));
RDebugUtils.currentLine=1048614;
 //BA.debugLineNum = 1048614;BA.debugLine="menu2.AddItem(LoadBitmap(File.DirAssets, \"circle-";
mostCurrent._menu2._additem(null,anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"circle-cropped(17).png"));
RDebugUtils.currentLine=1048615;
 //BA.debugLineNum = 1048615;BA.debugLine="menu2.AddItem(LoadBitmap(File.DirAssets, \"circle-";
mostCurrent._menu2._additem(null,anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"circle-cropped(17).png"));
RDebugUtils.currentLine=1048616;
 //BA.debugLineNum = 1048616;BA.debugLine="sm.Initialize(Activity, Me, \"SlideMenu\", 48dip, 2";
mostCurrent._sm._initialize(null,mostCurrent.activityBA,mostCurrent._activity,main1.getObject(),"SlideMenu",anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (48)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (230)));
RDebugUtils.currentLine=1048617;
 //BA.debugLineNum = 1048617;BA.debugLine="sm.AddItem(\" Home\", LoadBitmap(File.DirAssets, \"c";
mostCurrent._sm._additem(null," Home",anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"circle-cropped(7).png"),(Object)(1));
RDebugUtils.currentLine=1048618;
 //BA.debugLineNum = 1048618;BA.debugLine="sm.AddItem(\"Donation\", LoadBitmap(File.DirAssets,";
mostCurrent._sm._additem(null,"Donation",anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"donation-22-153879.png"),(Object)(2));
RDebugUtils.currentLine=1048619;
 //BA.debugLineNum = 1048619;BA.debugLine="sm.AddItem(\"What is new\", LoadBitmap(File.DirAsse";
mostCurrent._sm._additem(null,"What is new",anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"circle-cropped(12).png"),(Object)(3));
RDebugUtils.currentLine=1048620;
 //BA.debugLineNum = 1048620;BA.debugLine="sm.AddItem(\"Mission\", LoadBitmap(File.DirAssets,";
mostCurrent._sm._additem(null,"Mission",anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"circle-cropped(11).png"),(Object)(4));
RDebugUtils.currentLine=1048621;
 //BA.debugLineNum = 1048621;BA.debugLine="sm.AddItem(\"Map\", LoadBitmap(File.DirAssets, \"49-";
mostCurrent._sm._additem(null,"Map",anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"49-512-1.png"),(Object)(5));
RDebugUtils.currentLine=1048622;
 //BA.debugLineNum = 1048622;BA.debugLine="sm.AddItem(\"\", LoadBitmap(File.DirAssets, \"transp";
mostCurrent._sm._additem(null,"",anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"transparent.png"),(Object)(6));
RDebugUtils.currentLine=1048623;
 //BA.debugLineNum = 1048623;BA.debugLine="sm.AddItem(\"Exit\", LoadBitmap(File.DirAssets, \"15";
mostCurrent._sm._additem(null,"Exit",anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"1531801_1.jpg"),(Object)(7));
RDebugUtils.currentLine=1048640;
 //BA.debugLineNum = 1048640;BA.debugLine="Spotlightmenu.Initialize(Me,\"Spotlightmenu\",5%y,F";
mostCurrent._spotlightmenu._initialize(mostCurrent.activityBA,main1.getObject(),"Spotlightmenu",(float) (anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.False,anywheresoftware.b4a.keywords.Common.False,anywheresoftware.b4a.keywords.Common.True,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._buttoninfo.getObject())),mostCurrent._activity);
RDebugUtils.currentLine=1048642;
 //BA.debugLineNum = 1048642;BA.debugLine="Spotlightmenu.additem(\"Prayer request\",Colors.Bla";
mostCurrent._spotlightmenu._additem("Prayer request",anywheresoftware.b4a.keywords.Common.Colors.Black,(int) (15),anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"circle-cropped(14).png"));
RDebugUtils.currentLine=1048643;
 //BA.debugLineNum = 1048643;BA.debugLine="Spotlightmenu.additem(\"Email us\",Colors.Black,15,";
mostCurrent._spotlightmenu._additem("Email us",anywheresoftware.b4a.keywords.Common.Colors.Black,(int) (15),anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"circle-cropped(8).png"));
RDebugUtils.currentLine=1048648;
 //BA.debugLineNum = 1048648;BA.debugLine="End Sub";
return "";
}
public static boolean  _activity_keypress(int _keycode) throws Exception{
RDebugUtils.currentModule="main1";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_keypress"))
	return (Boolean) Debug.delegate(mostCurrent.activityBA, "activity_keypress", new Object[] {_keycode});
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
RDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK And sm.isVisib";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK && mostCurrent._sm._isvisible(null)) { 
RDebugUtils.currentLine=2162691;
 //BA.debugLineNum = 2162691;BA.debugLine="sm.Hide";
mostCurrent._sm._hide(null);
RDebugUtils.currentLine=2162692;
 //BA.debugLineNum = 2162692;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 };
RDebugUtils.currentLine=2162696;
 //BA.debugLineNum = 2162696;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_MENU Then";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_MENU) { 
RDebugUtils.currentLine=2162697;
 //BA.debugLineNum = 2162697;BA.debugLine="If sm.isVisible Then sm.Hide Else sm.Show";
if (mostCurrent._sm._isvisible(null)) { 
mostCurrent._sm._hide(null);}
else {
mostCurrent._sm._show(null);};
RDebugUtils.currentLine=2162698;
 //BA.debugLineNum = 2162698;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 };
RDebugUtils.currentLine=2162700;
 //BA.debugLineNum = 2162700;BA.debugLine="If ListView1.Visible=True Then";
if (mostCurrent._listview1.getVisible()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=2162701;
 //BA.debugLineNum = 2162701;BA.debugLine="ListView1.SetLayout(100%x,0%y,0dip,0dip)";
mostCurrent._listview1.SetLayout(anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (0),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)));
RDebugUtils.currentLine=2162702;
 //BA.debugLineNum = 2162702;BA.debugLine="ListView1.Visible=False";
mostCurrent._listview1.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=2162705;
 //BA.debugLineNum = 2162705;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=2162707;
 //BA.debugLineNum = 2162707;BA.debugLine="End Sub";
return false;
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="main1";
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="main1";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null);
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="End Sub";
return "";
}
public static String  _arcmenu_animationend(boolean _open) throws Exception{
RDebugUtils.currentModule="main1";
if (Debug.shouldDelegate(mostCurrent.activityBA, "arcmenu_animationend"))
	return (String) Debug.delegate(mostCurrent.activityBA, "arcmenu_animationend", new Object[] {_open});
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Sub ArcMenu_AnimationEnd(Open As Boolean)";
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="End Sub";
return "";
}
public static String  _arcmenu_click(int _position) throws Exception{
RDebugUtils.currentModule="main1";
if (Debug.shouldDelegate(mostCurrent.activityBA, "arcmenu_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "arcmenu_click", new Object[] {_position});
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Sub ArcMenu_Click(position As Int)";
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="Select position";
switch (_position) {
case 1: {
RDebugUtils.currentLine=1572869;
 //BA.debugLineNum = 1572869;BA.debugLine="StartActivity(chat)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._chat.getObject()));
 break; }
case 2: {
RDebugUtils.currentLine=1572872;
 //BA.debugLineNum = 1572872;BA.debugLine="StartActivity(facebook)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._facebook.getObject()));
 break; }
case 3: {
RDebugUtils.currentLine=1572874;
 //BA.debugLineNum = 1572874;BA.debugLine="StartActivity(youtube)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._youtube.getObject()));
 break; }
case 4: {
RDebugUtils.currentLine=1572876;
 //BA.debugLineNum = 1572876;BA.debugLine="StartActivity(note)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._note.getObject()));
 break; }
}
;
RDebugUtils.currentLine=1572880;
 //BA.debugLineNum = 1572880;BA.debugLine="End Sub";
return "";
}
public static String  _arcmenu_longclick(int _position) throws Exception{
RDebugUtils.currentModule="main1";
if (Debug.shouldDelegate(mostCurrent.activityBA, "arcmenu_longclick"))
	return (String) Debug.delegate(mostCurrent.activityBA, "arcmenu_longclick", new Object[] {_position});
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Sub ArcMenu_LongClick(position As Int)";
RDebugUtils.currentLine=1835009;
 //BA.debugLineNum = 1835009;BA.debugLine="ToastMessageShow(\"Item \" & position & \" LongClick";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Item "+BA.NumberToString(_position)+" LongClicked"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1835011;
 //BA.debugLineNum = 1835011;BA.debugLine="End Sub";
return "";
}
public static String  _arcmenu2_click(int _position) throws Exception{
RDebugUtils.currentModule="main1";
if (Debug.shouldDelegate(mostCurrent.activityBA, "arcmenu2_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "arcmenu2_click", new Object[] {_position});
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Sub ArcMenu2_Click(position As Int)";
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="Select position";
switch (_position) {
case 0: {
RDebugUtils.currentLine=1638404;
 //BA.debugLineNum = 1638404;BA.debugLine="ToastMessageShow(\"help\",False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("help"),anywheresoftware.b4a.keywords.Common.False);
 break; }
}
;
RDebugUtils.currentLine=1638407;
 //BA.debugLineNum = 1638407;BA.debugLine="End Sub";
return "";
}
public static String  _btnshow_click() throws Exception{
RDebugUtils.currentModule="main1";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnshow_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "btnshow_click", null);
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Sub btnShow_Click";
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="sm.Show";
mostCurrent._sm._show(null);
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="End Sub";
return "";
}
public static String  _button2_click() throws Exception{
RDebugUtils.currentModule="main1";
if (Debug.shouldDelegate(mostCurrent.activityBA, "button2_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "button2_click", null);
de.amberhome.actionbarhelper.PopupMenuWrapper _pop = null;
anywheresoftware.b4a.objects.ConcreteViewWrapper _v = null;
int _i = 0;
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Sub Button2_Click";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="Dim pop As PopupMenu";
_pop = new de.amberhome.actionbarhelper.PopupMenuWrapper();
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="Dim v As View";
_v = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
RDebugUtils.currentLine=1114116;
 //BA.debugLineNum = 1114116;BA.debugLine="v = Sender";
_v.setObject((android.view.View)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA)));
RDebugUtils.currentLine=1114118;
 //BA.debugLineNum = 1114118;BA.debugLine="pop.Initialize(\"PopupMenu\", v)";
_pop.Initialize(mostCurrent.activityBA,"PopupMenu",(android.view.View)(_v.getObject()));
RDebugUtils.currentLine=1114120;
 //BA.debugLineNum = 1114120;BA.debugLine="For i = 0 To 9";
{
final int step5 = 1;
final int limit5 = (int) (9);
_i = (int) (0) ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
RDebugUtils.currentLine=1114121;
 //BA.debugLineNum = 1114121;BA.debugLine="pop.AddMenuItem(i, \"MenuItem \" & i, GetDrawable(";
_pop.AddMenuItem(_i,BA.ObjectToCharSequence("MenuItem "+BA.NumberToString(_i)),(android.graphics.drawable.Drawable)(_getdrawable("ic_action_edit")));
 }
};
RDebugUtils.currentLine=1114124;
 //BA.debugLineNum = 1114124;BA.debugLine="pop.Show";
_pop.Show();
RDebugUtils.currentLine=1114125;
 //BA.debugLineNum = 1114125;BA.debugLine="End Sub";
return "";
}
public static Object  _getdrawable(String _name) throws Exception{
RDebugUtils.currentModule="main1";
if (Debug.shouldDelegate(mostCurrent.activityBA, "getdrawable"))
	return (Object) Debug.delegate(mostCurrent.activityBA, "getdrawable", new Object[] {_name});
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
String _package = "";
int _id = 0;
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Sub GetDrawable(Name As String) As Object";
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="Dim package As String";
_package = "";
RDebugUtils.currentLine=1310723;
 //BA.debugLineNum = 1310723;BA.debugLine="Dim id As Int";
_id = 0;
RDebugUtils.currentLine=1310724;
 //BA.debugLineNum = 1310724;BA.debugLine="package = r.GetStaticField(\"anywheresoftware.b4a.";
_package = BA.ObjectToString(_r.GetStaticField("anywheresoftware.b4a.BA","packageName"));
RDebugUtils.currentLine=1310725;
 //BA.debugLineNum = 1310725;BA.debugLine="id = r.GetStaticField(package & \".R$drawable\", Na";
_id = (int)(BA.ObjectToNumber(_r.GetStaticField(_package+".R$drawable",_name)));
RDebugUtils.currentLine=1310726;
 //BA.debugLineNum = 1310726;BA.debugLine="r.Target = r.GetContext";
_r.Target = (Object)(_r.GetContext(processBA));
RDebugUtils.currentLine=1310727;
 //BA.debugLineNum = 1310727;BA.debugLine="r.Target = r.RunMethod(\"getResources\")";
_r.Target = _r.RunMethod("getResources");
RDebugUtils.currentLine=1310728;
 //BA.debugLineNum = 1310728;BA.debugLine="Return r.RunMethod2(\"getDrawable\", id, \"java.lang";
if (true) return _r.RunMethod2("getDrawable",BA.NumberToString(_id),"java.lang.int");
RDebugUtils.currentLine=1310729;
 //BA.debugLineNum = 1310729;BA.debugLine="End Sub";
return null;
}
public static String  _button3_click() throws Exception{
RDebugUtils.currentModule="main1";
if (Debug.shouldDelegate(mostCurrent.activityBA, "button3_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "button3_click", null);
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Sub Button3_Click";
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="ListView1.Visible=True";
mostCurrent._listview1.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="ListView1.BringToFront";
mostCurrent._listview1.BringToFront();
RDebugUtils.currentLine=2359299;
 //BA.debugLineNum = 2359299;BA.debugLine="ListView1.SetLayoutAnimated(250,ListView1.Left,Li";
mostCurrent._listview1.SetLayoutAnimated((int) (250),mostCurrent._listview1.getLeft(),mostCurrent._listview1.getTop(),mostCurrent._listview1.getWidth(),(int) (mostCurrent._listview1.getSingleLineLayout().getItemHeight()*4));
RDebugUtils.currentLine=2359300;
 //BA.debugLineNum = 2359300;BA.debugLine="End Sub";
return "";
}
public static String  _buttoninfo_click() throws Exception{
RDebugUtils.currentModule="main1";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttoninfo_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "buttoninfo_click", null);
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Sub Buttoninfo_Click";
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="Spotlightmenu.show";
mostCurrent._spotlightmenu._show();
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="End Sub";
return "";
}
public static String  _exitbutton_click() throws Exception{
RDebugUtils.currentModule="main1";
if (Debug.shouldDelegate(mostCurrent.activityBA, "exitbutton_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "exitbutton_click", null);
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Sub ExitButton_Click";
RDebugUtils.currentLine=2490371;
 //BA.debugLineNum = 2490371;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=2490373;
 //BA.debugLineNum = 2490373;BA.debugLine="End Sub";
return "";
}
public static String  _image1_click() throws Exception{
RDebugUtils.currentModule="main1";
if (Debug.shouldDelegate(mostCurrent.activityBA, "image1_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "image1_click", null);
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Sub Image1_Click";
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="End Sub";
return "";
}
public static String  _listview1_closed() throws Exception{
RDebugUtils.currentModule="main1";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listview1_closed"))
	return (String) Debug.delegate(mostCurrent.activityBA, "listview1_closed", null);
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Sub listview1_Closed";
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="ListView1.SetLayout(100%x,0%y,0dip,0dip)";
mostCurrent._listview1.SetLayout(anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (0),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)));
RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="ListView1.Visible=False";
mostCurrent._listview1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2424836;
 //BA.debugLineNum = 2424836;BA.debugLine="End Sub";
return "";
}
public static String  _menu_click() throws Exception{
RDebugUtils.currentModule="main1";
if (Debug.shouldDelegate(mostCurrent.activityBA, "menu_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "menu_click", null);
de.amberhome.actionbarhelper.PopupMenuWrapper _pop = null;
int _i = 0;
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Sub Menu_Click";
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="Log(\"Show popup\")";
anywheresoftware.b4a.keywords.Common.Log("Show popup");
RDebugUtils.currentLine=1376260;
 //BA.debugLineNum = 1376260;BA.debugLine="dummy.Initialize(\"\")";
mostCurrent._dummy.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=1376261;
 //BA.debugLineNum = 1376261;BA.debugLine="Activity.AddView(dummy, 80%x, 0, 1dip, 1dip)";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._dummy.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (80),mostCurrent.activityBA),(int) (0),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (1)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (1)));
RDebugUtils.currentLine=1376262;
 //BA.debugLineNum = 1376262;BA.debugLine="dummy.Color = Colors.Transparent";
mostCurrent._dummy.setColor(anywheresoftware.b4a.keywords.Common.Colors.Transparent);
RDebugUtils.currentLine=1376265;
 //BA.debugLineNum = 1376265;BA.debugLine="Dim pop As PopupMenu";
_pop = new de.amberhome.actionbarhelper.PopupMenuWrapper();
RDebugUtils.currentLine=1376266;
 //BA.debugLineNum = 1376266;BA.debugLine="pop.Initialize(\"ABPop\", dummy)";
_pop.Initialize(mostCurrent.activityBA,"ABPop",(android.view.View)(mostCurrent._dummy.getObject()));
RDebugUtils.currentLine=1376268;
 //BA.debugLineNum = 1376268;BA.debugLine="For i = 0 To 0";
{
final int step7 = 1;
final int limit7 = (int) (0);
_i = (int) (0) ;
for (;(step7 > 0 && _i <= limit7) || (step7 < 0 && _i >= limit7) ;_i = ((int)(0 + _i + step7))  ) {
RDebugUtils.currentLine=1376269;
 //BA.debugLineNum = 1376269;BA.debugLine="pop.AddMenuItem(i, \"About us \" , GetDrawable(\"a_";
_pop.AddMenuItem(_i,BA.ObjectToCharSequence("About us "),(android.graphics.drawable.Drawable)(_getdrawable("a_b_c")));
 }
};
RDebugUtils.currentLine=1376272;
 //BA.debugLineNum = 1376272;BA.debugLine="pop.Show";
_pop.Show();
RDebugUtils.currentLine=1376273;
 //BA.debugLineNum = 1376273;BA.debugLine="End Sub";
return "";
}
public static String  _popupmenu_closed() throws Exception{
RDebugUtils.currentModule="main1";
if (Debug.shouldDelegate(mostCurrent.activityBA, "popupmenu_closed"))
	return (String) Debug.delegate(mostCurrent.activityBA, "popupmenu_closed", null);
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Sub PopupMenu_Closed";
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="Log(\"PopupMenu closed\")";
anywheresoftware.b4a.keywords.Common.Log("PopupMenu closed");
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="End Sub";
return "";
}
public static String  _slidemenu_click(Object _item) throws Exception{
RDebugUtils.currentModule="main1";
if (Debug.shouldDelegate(mostCurrent.activityBA, "slidemenu_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "slidemenu_click", new Object[] {_item});
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Sub SlideMenu_Click(Item As Object)";
RDebugUtils.currentLine=1769473;
 //BA.debugLineNum = 1769473;BA.debugLine="Select Item";
switch (BA.switchObjectToInt(_item,(Object)(1),(Object)(2),(Object)(3),(Object)(4),(Object)(5),(Object)(7))) {
case 0: {
RDebugUtils.currentLine=1769475;
 //BA.debugLineNum = 1769475;BA.debugLine="StartActivity(currency)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._currency.getObject()));
 break; }
case 1: {
RDebugUtils.currentLine=1769478;
 //BA.debugLineNum = 1769478;BA.debugLine="StartActivity(donate)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._donate.getObject()));
 break; }
case 2: {
RDebugUtils.currentLine=1769480;
 //BA.debugLineNum = 1769480;BA.debugLine="StartActivity(news)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._news.getObject()));
 break; }
case 3: {
RDebugUtils.currentLine=1769482;
 //BA.debugLineNum = 1769482;BA.debugLine="StartActivity(mission)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._mission.getObject()));
 break; }
case 4: {
RDebugUtils.currentLine=1769484;
 //BA.debugLineNum = 1769484;BA.debugLine="StartActivity(map)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._map.getObject()));
 break; }
case 5: {
RDebugUtils.currentLine=1769487;
 //BA.debugLineNum = 1769487;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 break; }
}
;
RDebugUtils.currentLine=1769491;
 //BA.debugLineNum = 1769491;BA.debugLine="End Sub";
return "";
}
public static String  _spotlightmenu_click(int _index) throws Exception{
RDebugUtils.currentModule="main1";
if (Debug.shouldDelegate(mostCurrent.activityBA, "spotlightmenu_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "spotlightmenu_click", new Object[] {_index});
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Sub Spotlightmenu_Click(index As Int)";
RDebugUtils.currentLine=1703937;
 //BA.debugLineNum = 1703937;BA.debugLine="Select index";
switch (_index) {
case 0: {
RDebugUtils.currentLine=1703939;
 //BA.debugLineNum = 1703939;BA.debugLine="StartActivity(prayer)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._prayer.getObject()));
 break; }
case 1: {
RDebugUtils.currentLine=1703941;
 //BA.debugLineNum = 1703941;BA.debugLine="StartActivity(email)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._email.getObject()));
 break; }
case 2: {
RDebugUtils.currentLine=1703943;
 //BA.debugLineNum = 1703943;BA.debugLine="ToastMessageShow(\"help\",False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("help"),anywheresoftware.b4a.keywords.Common.False);
 break; }
case 3: {
RDebugUtils.currentLine=1703945;
 //BA.debugLineNum = 1703945;BA.debugLine="ToastMessageShow(\"help\",False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("help"),anywheresoftware.b4a.keywords.Common.False);
 break; }
}
;
RDebugUtils.currentLine=1703951;
 //BA.debugLineNum = 1703951;BA.debugLine="End Sub";
return "";
}
}