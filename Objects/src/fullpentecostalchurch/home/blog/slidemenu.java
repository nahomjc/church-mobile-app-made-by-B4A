package fullpentecostalchurch.home.blog;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class slidemenu extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "fullpentecostalchurch.home.blog.slidemenu");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", fullpentecostalchurch.home.blog.slidemenu.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _actionitem{
public boolean IsInitialized;
public String Text;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper Image;
public Object Value;
public void Initialize() {
IsInitialized = true;
Text = "";
Image = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
Value = new Object();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.PanelWrapper _mslidepanel = null;
public anywheresoftware.b4a.objects.PanelWrapper _mbackpanel = null;
public Object _mmodule = null;
public String _meventname = "";
public anywheresoftware.b4a.objects.ListViewWrapper _mlistview = null;
public anywheresoftware.b4a.objects.AnimationWrapper _minanimation = null;
public anywheresoftware.b4a.objects.AnimationWrapper _moutanimation = null;
public fullpentecostalchurch.home.blog.main _main = null;
public fullpentecostalchurch.home.blog.main1 _main1 = null;
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
public String  _initialize(fullpentecostalchurch.home.blog.slidemenu __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.ActivityWrapper _activity,Object _module,String _eventname,int _top,int _width) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="slidemenu";
if (Debug.shouldDelegate(ba, "initialize"))
	return (String) Debug.delegate(ba, "initialize", new Object[] {_ba,_activity,_module,_eventname,_top,_width});
RDebugUtils.currentLine=5308416;
 //BA.debugLineNum = 5308416;BA.debugLine="Sub Initialize(Activity As Activity, Module As Obj";
RDebugUtils.currentLine=5308417;
 //BA.debugLineNum = 5308417;BA.debugLine="mModule = Module";
__ref._mmodule = _module;
RDebugUtils.currentLine=5308418;
 //BA.debugLineNum = 5308418;BA.debugLine="mEventName = EventName";
__ref._meventname = _eventname;
RDebugUtils.currentLine=5308420;
 //BA.debugLineNum = 5308420;BA.debugLine="mSlidePanel.Initialize(\"mSlidePanel\")";
__ref._mslidepanel.Initialize(ba,"mSlidePanel");
RDebugUtils.currentLine=5308422;
 //BA.debugLineNum = 5308422;BA.debugLine="mListView.Initialize(\"mListView\")";
__ref._mlistview.Initialize(ba,"mListView");
RDebugUtils.currentLine=5308423;
 //BA.debugLineNum = 5308423;BA.debugLine="mListView.TwoLinesAndBitmap.SecondLabel.Visible =";
__ref._mlistview.getTwoLinesAndBitmap().SecondLabel.setVisible(__c.False);
RDebugUtils.currentLine=5308424;
 //BA.debugLineNum = 5308424;BA.debugLine="mListView.TwoLinesAndBitmap.ItemHeight = 50dip";
__ref._mlistview.getTwoLinesAndBitmap().setItemHeight(__c.DipToCurrent((int) (50)));
RDebugUtils.currentLine=5308425;
 //BA.debugLineNum = 5308425;BA.debugLine="mListView.TwoLinesAndBitmap.Label.Gravity = Gravi";
__ref._mlistview.getTwoLinesAndBitmap().Label.setGravity(__c.Gravity.CENTER_VERTICAL);
RDebugUtils.currentLine=5308426;
 //BA.debugLineNum = 5308426;BA.debugLine="mListView.TwoLinesAndBitmap.Label.Height = mListV";
__ref._mlistview.getTwoLinesAndBitmap().Label.setHeight(__ref._mlistview.getTwoLinesAndBitmap().getItemHeight());
RDebugUtils.currentLine=5308427;
 //BA.debugLineNum = 5308427;BA.debugLine="mListView.TwoLinesAndBitmap.Label.Top = 0";
__ref._mlistview.getTwoLinesAndBitmap().Label.setTop((int) (0));
RDebugUtils.currentLine=5308428;
 //BA.debugLineNum = 5308428;BA.debugLine="mListView.TwoLinesAndBitmap.ImageView.SetLayout(1";
__ref._mlistview.getTwoLinesAndBitmap().ImageView.SetLayout(__c.DipToCurrent((int) (13)),__c.DipToCurrent((int) (13)),__c.DipToCurrent((int) (24)),__c.DipToCurrent((int) (24)));
RDebugUtils.currentLine=5308429;
 //BA.debugLineNum = 5308429;BA.debugLine="mListView.Color = Colors.Black";
__ref._mlistview.setColor(__c.Colors.Black);
RDebugUtils.currentLine=5308431;
 //BA.debugLineNum = 5308431;BA.debugLine="mInAnimation.InitializeTranslate(\"\", -Width, 0, 0";
__ref._minanimation.InitializeTranslate(ba,"",(float) (-_width),(float) (0),(float) (0),(float) (0));
RDebugUtils.currentLine=5308432;
 //BA.debugLineNum = 5308432;BA.debugLine="mInAnimation.Duration = 200";
__ref._minanimation.setDuration((long) (200));
RDebugUtils.currentLine=5308433;
 //BA.debugLineNum = 5308433;BA.debugLine="mOutAnimation.InitializeTranslate(\"Out\", Width, 0";
__ref._moutanimation.InitializeTranslate(ba,"Out",(float) (_width),(float) (0),(float) (0),(float) (0));
RDebugUtils.currentLine=5308434;
 //BA.debugLineNum = 5308434;BA.debugLine="mOutAnimation.Duration = 200";
__ref._moutanimation.setDuration((long) (200));
RDebugUtils.currentLine=5308436;
 //BA.debugLineNum = 5308436;BA.debugLine="Activity.AddView(mSlidePanel, 0, Top, Width, 100%";
_activity.AddView((android.view.View)(__ref._mslidepanel.getObject()),(int) (0),_top,_width,(int) (__c.PerYToCurrent((float) (100),ba)-_top));
RDebugUtils.currentLine=5308438;
 //BA.debugLineNum = 5308438;BA.debugLine="mBackPanel.Initialize(\"mBackPanel\")";
__ref._mbackpanel.Initialize(ba,"mBackPanel");
RDebugUtils.currentLine=5308439;
 //BA.debugLineNum = 5308439;BA.debugLine="mBackPanel.Color = Colors.Transparent";
__ref._mbackpanel.setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=5308440;
 //BA.debugLineNum = 5308440;BA.debugLine="Activity.AddView(mBackPanel, -100%x, 0, 100%x, 10";
_activity.AddView((android.view.View)(__ref._mbackpanel.getObject()),(int) (-__c.PerXToCurrent((float) (100),ba)),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
RDebugUtils.currentLine=5308442;
 //BA.debugLineNum = 5308442;BA.debugLine="mSlidePanel.AddView(mListView, 0, 0, mSlidePanel.";
__ref._mslidepanel.AddView((android.view.View)(__ref._mlistview.getObject()),(int) (0),(int) (0),__ref._mslidepanel.getWidth(),__ref._mslidepanel.getHeight());
RDebugUtils.currentLine=5308443;
 //BA.debugLineNum = 5308443;BA.debugLine="mSlidePanel.Visible = False";
__ref._mslidepanel.setVisible(__c.False);
RDebugUtils.currentLine=5308444;
 //BA.debugLineNum = 5308444;BA.debugLine="End Sub";
return "";
}
public String  _additem(fullpentecostalchurch.home.blog.slidemenu __ref,String _text,anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _image,Object _returnvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="slidemenu";
if (Debug.shouldDelegate(ba, "additem"))
	return (String) Debug.delegate(ba, "additem", new Object[] {_text,_image,_returnvalue});
fullpentecostalchurch.home.blog.slidemenu._actionitem _item = null;
RDebugUtils.currentLine=5373952;
 //BA.debugLineNum = 5373952;BA.debugLine="Public Sub AddItem(Text As String, Image As Bitmap";
RDebugUtils.currentLine=5373953;
 //BA.debugLineNum = 5373953;BA.debugLine="Dim item As ActionItem";
_item = new fullpentecostalchurch.home.blog.slidemenu._actionitem();
RDebugUtils.currentLine=5373954;
 //BA.debugLineNum = 5373954;BA.debugLine="item.Initialize";
_item.Initialize();
RDebugUtils.currentLine=5373955;
 //BA.debugLineNum = 5373955;BA.debugLine="item.Text = Text";
_item.Text = _text;
RDebugUtils.currentLine=5373956;
 //BA.debugLineNum = 5373956;BA.debugLine="item.Image = Image";
_item.Image = _image;
RDebugUtils.currentLine=5373957;
 //BA.debugLineNum = 5373957;BA.debugLine="item.Value = ReturnValue";
_item.Value = _returnvalue;
RDebugUtils.currentLine=5373959;
 //BA.debugLineNum = 5373959;BA.debugLine="If Not(Image.IsInitialized) Then";
if (__c.Not(_image.IsInitialized())) { 
RDebugUtils.currentLine=5373960;
 //BA.debugLineNum = 5373960;BA.debugLine="mListView.AddTwoLinesAndBitmap2(Text, \"\", Null,";
__ref._mlistview.AddTwoLinesAndBitmap2(BA.ObjectToCharSequence(_text),BA.ObjectToCharSequence(""),(android.graphics.Bitmap)(__c.Null),_returnvalue);
 }else {
RDebugUtils.currentLine=5373962;
 //BA.debugLineNum = 5373962;BA.debugLine="mListView.AddTwoLinesAndBitmap2(Text, \"\", Image,";
__ref._mlistview.AddTwoLinesAndBitmap2(BA.ObjectToCharSequence(_text),BA.ObjectToCharSequence(""),(android.graphics.Bitmap)(_image.getObject()),_returnvalue);
 };
RDebugUtils.currentLine=5373964;
 //BA.debugLineNum = 5373964;BA.debugLine="End Sub";
return "";
}
public boolean  _isvisible(fullpentecostalchurch.home.blog.slidemenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="slidemenu";
if (Debug.shouldDelegate(ba, "isvisible"))
	return (Boolean) Debug.delegate(ba, "isvisible", null);
RDebugUtils.currentLine=5767168;
 //BA.debugLineNum = 5767168;BA.debugLine="Public Sub isVisible As Boolean";
RDebugUtils.currentLine=5767169;
 //BA.debugLineNum = 5767169;BA.debugLine="Return mSlidePanel.Visible";
if (true) return __ref._mslidepanel.getVisible();
RDebugUtils.currentLine=5767170;
 //BA.debugLineNum = 5767170;BA.debugLine="End Sub";
return false;
}
public String  _hide(fullpentecostalchurch.home.blog.slidemenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="slidemenu";
if (Debug.shouldDelegate(ba, "hide"))
	return (String) Debug.delegate(ba, "hide", null);
RDebugUtils.currentLine=5505024;
 //BA.debugLineNum = 5505024;BA.debugLine="Public Sub Hide";
RDebugUtils.currentLine=5505025;
 //BA.debugLineNum = 5505025;BA.debugLine="If isVisible = False Then Return";
if (__ref._isvisible(null)==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=5505027;
 //BA.debugLineNum = 5505027;BA.debugLine="mBackPanel.Left = -mBackPanel.Width";
__ref._mbackpanel.setLeft((int) (-__ref._mbackpanel.getWidth()));
RDebugUtils.currentLine=5505028;
 //BA.debugLineNum = 5505028;BA.debugLine="mSlidePanel.Left = -mSlidePanel.Width";
__ref._mslidepanel.setLeft((int) (-__ref._mslidepanel.getWidth()));
RDebugUtils.currentLine=5505029;
 //BA.debugLineNum = 5505029;BA.debugLine="mOutAnimation.Start(mSlidePanel)";
__ref._moutanimation.Start((android.view.View)(__ref._mslidepanel.getObject()));
RDebugUtils.currentLine=5505030;
 //BA.debugLineNum = 5505030;BA.debugLine="End Sub";
return "";
}
public String  _show(fullpentecostalchurch.home.blog.slidemenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="slidemenu";
if (Debug.shouldDelegate(ba, "show"))
	return (String) Debug.delegate(ba, "show", null);
RDebugUtils.currentLine=5439488;
 //BA.debugLineNum = 5439488;BA.debugLine="Public Sub Show";
RDebugUtils.currentLine=5439489;
 //BA.debugLineNum = 5439489;BA.debugLine="If isVisible = True Then Return";
if (__ref._isvisible(null)==__c.True) { 
if (true) return "";};
RDebugUtils.currentLine=5439491;
 //BA.debugLineNum = 5439491;BA.debugLine="mBackPanel.BringToFront";
__ref._mbackpanel.BringToFront();
RDebugUtils.currentLine=5439492;
 //BA.debugLineNum = 5439492;BA.debugLine="mSlidePanel.BringToFront";
__ref._mslidepanel.BringToFront();
RDebugUtils.currentLine=5439493;
 //BA.debugLineNum = 5439493;BA.debugLine="mBackPanel.Left = 0";
__ref._mbackpanel.setLeft((int) (0));
RDebugUtils.currentLine=5439494;
 //BA.debugLineNum = 5439494;BA.debugLine="mSlidePanel.Left = 0";
__ref._mslidepanel.setLeft((int) (0));
RDebugUtils.currentLine=5439496;
 //BA.debugLineNum = 5439496;BA.debugLine="mSlidePanel.Visible = True";
__ref._mslidepanel.setVisible(__c.True);
RDebugUtils.currentLine=5439497;
 //BA.debugLineNum = 5439497;BA.debugLine="mInAnimation.Start(mSlidePanel)";
__ref._minanimation.Start((android.view.View)(__ref._mslidepanel.getObject()));
RDebugUtils.currentLine=5439498;
 //BA.debugLineNum = 5439498;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(fullpentecostalchurch.home.blog.slidemenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="slidemenu";
RDebugUtils.currentLine=5242880;
 //BA.debugLineNum = 5242880;BA.debugLine="Private Sub Class_Globals";
RDebugUtils.currentLine=5242881;
 //BA.debugLineNum = 5242881;BA.debugLine="Type ActionItem (Text As String, Image As Bitmap,";
;
RDebugUtils.currentLine=5242883;
 //BA.debugLineNum = 5242883;BA.debugLine="Private mSlidePanel As Panel";
_mslidepanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=5242884;
 //BA.debugLineNum = 5242884;BA.debugLine="Private mBackPanel As Panel";
_mbackpanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=5242886;
 //BA.debugLineNum = 5242886;BA.debugLine="Private mModule As Object";
_mmodule = new Object();
RDebugUtils.currentLine=5242887;
 //BA.debugLineNum = 5242887;BA.debugLine="Private mEventName As String";
_meventname = "";
RDebugUtils.currentLine=5242889;
 //BA.debugLineNum = 5242889;BA.debugLine="Private mListView As ListView";
_mlistview = new anywheresoftware.b4a.objects.ListViewWrapper();
RDebugUtils.currentLine=5242891;
 //BA.debugLineNum = 5242891;BA.debugLine="Private mInAnimation As Animation";
_minanimation = new anywheresoftware.b4a.objects.AnimationWrapper();
RDebugUtils.currentLine=5242892;
 //BA.debugLineNum = 5242892;BA.debugLine="Private mOutAnimation As Animation";
_moutanimation = new anywheresoftware.b4a.objects.AnimationWrapper();
RDebugUtils.currentLine=5242893;
 //BA.debugLineNum = 5242893;BA.debugLine="End Sub";
return "";
}
public String  _mbackpanel_touch(fullpentecostalchurch.home.blog.slidemenu __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="slidemenu";
if (Debug.shouldDelegate(ba, "mbackpanel_touch"))
	return (String) Debug.delegate(ba, "mbackpanel_touch", new Object[] {_action,_x,_y});
RDebugUtils.currentLine=5636096;
 //BA.debugLineNum = 5636096;BA.debugLine="Private Sub mBackPanel_Touch (Action As Int, X As";
RDebugUtils.currentLine=5636097;
 //BA.debugLineNum = 5636097;BA.debugLine="If Action = 1 Then";
if (_action==1) { 
RDebugUtils.currentLine=5636098;
 //BA.debugLineNum = 5636098;BA.debugLine="Hide";
__ref._hide(null);
 };
RDebugUtils.currentLine=5636100;
 //BA.debugLineNum = 5636100;BA.debugLine="End Sub";
return "";
}
public String  _mlistview_itemclick(fullpentecostalchurch.home.blog.slidemenu __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="slidemenu";
if (Debug.shouldDelegate(ba, "mlistview_itemclick"))
	return (String) Debug.delegate(ba, "mlistview_itemclick", new Object[] {_position,_value});
String _subname = "";
RDebugUtils.currentLine=5701632;
 //BA.debugLineNum = 5701632;BA.debugLine="Private Sub mListView_ItemClick (Position As Int,";
RDebugUtils.currentLine=5701633;
 //BA.debugLineNum = 5701633;BA.debugLine="Dim subname As String";
_subname = "";
RDebugUtils.currentLine=5701634;
 //BA.debugLineNum = 5701634;BA.debugLine="Hide";
__ref._hide(null);
RDebugUtils.currentLine=5701635;
 //BA.debugLineNum = 5701635;BA.debugLine="subname = mEventName & \"_Click\"";
_subname = __ref._meventname+"_Click";
RDebugUtils.currentLine=5701636;
 //BA.debugLineNum = 5701636;BA.debugLine="If SubExists(mModule, subname) Then";
if (__c.SubExists(ba,__ref._mmodule,_subname)) { 
RDebugUtils.currentLine=5701637;
 //BA.debugLineNum = 5701637;BA.debugLine="CallSub2(mModule, subname, Value)";
__c.CallSubNew2(ba,__ref._mmodule,_subname,_value);
 };
RDebugUtils.currentLine=5701639;
 //BA.debugLineNum = 5701639;BA.debugLine="End Sub";
return "";
}
public String  _out_animationend(fullpentecostalchurch.home.blog.slidemenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="slidemenu";
if (Debug.shouldDelegate(ba, "out_animationend"))
	return (String) Debug.delegate(ba, "out_animationend", null);
RDebugUtils.currentLine=5570560;
 //BA.debugLineNum = 5570560;BA.debugLine="Private Sub Out_AnimationEnd";
RDebugUtils.currentLine=5570561;
 //BA.debugLineNum = 5570561;BA.debugLine="mSlidePanel.Visible = False";
__ref._mslidepanel.setVisible(__c.False);
RDebugUtils.currentLine=5570562;
 //BA.debugLineNum = 5570562;BA.debugLine="End Sub";
return "";
}
}