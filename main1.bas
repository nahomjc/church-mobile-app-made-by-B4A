B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=8
@EndOfDesignText@

#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: true
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
		
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Private ImageView1 As ImageView
	
	
	Dim dummy As Panel
	Dim menu As ArcMenu
	Dim menu2 As ArcMenu2
	Private Buttoninfo As Button
	Dim sm As SlideMenu
	Private Spotlightmenu As SpotLight
	Private FPC As Button
	Private Button2 As Button
	Private Button1 As Button
	Dim listsiz As ListView
	Dim ComServ As String
	
	Dim WebView1 As WebView
	
	Private ListView1 As ListView
	
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	
	
	'WebView1.LoadURL("File:///android_asset/banner1.html")
	
	
	Activity.LoadLayout("Main")
	
	Activity.Title = "Full Pentecostal Church"
	
	ListView1.Visible=False
	ListView1.AddSingleLine(" help")
	ListView1.AddSingleLine(" help")
	ListView1.AddSingleLine(" help")
	ListView1.SingleLineLayout.Label.Text=Colors.RGB(38,50,56)
	ListView1.SingleLineLayout.Label.TextSize=14
	ListView1.SingleLineLayout.ItemHeight=35dip
	listsiz.Initialize("")
	listsiz.SetLayout(ListView1.Left,ListView1.Top,ListView1.Width,ListView1.SingleLineLayout.ItemHeight*4)
	
	ListView1.SetLayout(100%x,0%y,0dip,0dip)
	Activity.AddMenuItem3("📚", "Menu", Null, True)
	
	menu.Initialize(Activity,Me, "ArcMenu",LoadBitmap(File.DirAssets, "plus11.png"), LoadBitmap(File.DirAssets, "menu23.png"), 10%x, 93%y)
	'menu.Initialize(,Activity,Me, "ArcMenu",LoadBitmap(File.DirAssets, "menu22.png"), LoadBitmap(File.DirAssets, "menu23.png"), 50%x, 60%y)
	menu.SetDegreeSpan(90)
	menu.SetMenuItemRadius(40%x)
	menu.AddItem(LoadBitmap(File.DirAssets, "circle-cropped(9).png"))
	menu.AddItem(LoadBitmap(File.DirAssets, "circle-cropped(6).png"))
	menu.AddItem(LoadBitmap(File.DirAssets, "circle-cropped(5).png"))
	menu.AddItem(LoadBitmap(File.DirAssets, "not1.png"))
	
	
	menu2.Initialize(Activity,Me, "ArcMenu2",LoadBitmap(File.DirAssets, "circle-cropped(2).png"), LoadBitmap(File.DirAssets, "menu23.png"), 50%x, 12%y)
	'menu.Initialize(,Activity,Me, "ArcMenu",LoadBitmap(File.DirAssets, "menu22.png"), LoadBitmap(File.DirAssets, "menu23.png"), 50%x, 60%y)
	menu2.SetDegreeSpan(180)
	menu2.SetMenuItemRadius(30%x)
	menu2.AddItem(LoadBitmap(File.DirAssets, "circle-cropped(17).png"))
	menu2.AddItem(LoadBitmap(File.DirAssets, "circle-cropped(17).png"))
	sm.Initialize(Activity, Me, "SlideMenu", 48dip, 230dip)
	sm.AddItem(" Home", LoadBitmap(File.DirAssets, "circle-cropped(7).png"), 1)
	sm.AddItem("Donation", LoadBitmap(File.DirAssets, "donation-22-153879.png"), 2)
	sm.AddItem("What is new", LoadBitmap(File.DirAssets, "circle-cropped(12).png"), 3)
	sm.AddItem("Mission", LoadBitmap(File.DirAssets, "circle-cropped(11).png"), 4)
	sm.AddItem("Map", LoadBitmap(File.DirAssets, "49-512-1.png"), 5)
	sm.AddItem("", LoadBitmap(File.DirAssets, "transparent.png"), 6)
	sm.AddItem("Exit", LoadBitmap(File.DirAssets, "1531801_1.jpg"), 7)
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	Spotlightmenu.Initialize(Me,"Spotlightmenu",5%y,False,False,True,Buttoninfo,Activity)
	
	Spotlightmenu.additem("Prayer request",Colors.Black,15,LoadBitmap(File.DirAssets,"circle-cropped(14).png"))
	Spotlightmenu.additem("Email us",Colors.Black,15,LoadBitmap(File.DirAssets,"circle-cropped(8).png"))
	
	


End Sub




Sub Button2_Click
	Dim pop As PopupMenu
	Dim v As View
	
	v = Sender
	
	pop.Initialize("PopupMenu", v)
	
	For i = 0 To 9
		pop.AddMenuItem(i, "MenuItem " & i, GetDrawable("ic_action_edit"))
	Next
	
	pop.Show
End Sub
Sub PopupMenu_ItemClicked (Item As MenuItem)
	MsgboxAsync("📱Version 1.0                                   🛂Developed by Nahom Tesfaye                                  📞For More Info Call 0960148453                                                        ⛪Full Pentecostal church app is all about helping Children's of GOD to have deep relationship with Jesus and Assisting Christian's to Grow in the knowledge of Christ🙏", "About us👨")
End Sub

Sub PopupMenu_Closed
	Log("PopupMenu closed")
End Sub
Sub GetDrawable(Name As String) As Object
	Dim r As Reflector
	Dim package As String
	Dim id As Int
	package = r.GetStaticField("anywheresoftware.b4a.BA", "packageName")
	id = r.GetStaticField(package & ".R$drawable", Name)
	r.Target = r.GetContext
	r.Target = r.RunMethod("getResources")
	Return r.RunMethod2("getDrawable", id, "java.lang.int")
End Sub

Sub Menu_Click
	Log("Show popup")

	'add the dummy view to the activity
	dummy.Initialize("")
	Activity.AddView(dummy, 80%x, 0, 1dip, 1dip)
	dummy.Color = Colors.Transparent

	'Create and show popup menu
	Dim pop As PopupMenu
	pop.Initialize("ABPop", dummy)
	
	For i = 0 To 0
		pop.AddMenuItem(i, "About us " , GetDrawable("a_b_c"))
	Next
	
	pop.Show
End Sub
Sub ABPop_Closed
	dummy.RemoveView
End Sub

Sub ABPop_ItemClicked (Item As MenuItem)
	'Call the same sub as if we pressed a button popup menu
	PopupMenu_ItemClicked(Item)
End Sub

' Remove the dummy view from the activity




' Helper function to get the edit icon drawable

Sub ArcMenu_Click(position As Int)
	'ToastMessageShow("Item " & position & " Clicked", False)
	Select position
		
		Case 1
			StartActivity(chat)
			
		Case 2
			StartActivity(facebook)
		Case 3
			StartActivity(youtube)
		Case 4
			StartActivity(note)
			
	End Select

End Sub
Sub ArcMenu2_Click(position As Int)
	'ToastMessageShow("Item " & position & " Clicked", False)
	Select position
		Case 0
			ToastMessageShow("help",False)
	
	End Select
End Sub

Sub Spotlightmenu_Click(index As Int)
	Select index
		Case 0
			StartActivity(prayer)
		Case 1
			StartActivity(email)
		Case 2
			ToastMessageShow("help",False)
		Case 3
			ToastMessageShow("help",False)
			'ToastMessageShow("clicked",False)
		
	End Select
	'ToastMessageShow("Item number " & index & " was pressed", False)

End Sub
Sub SlideMenu_Click(Item As Object)
	Select Item
		Case 1
			StartActivity(currency)
			
		Case 2
			StartActivity(donate)
		Case 3
			StartActivity(news)
		Case 4
			StartActivity(mission)
		Case 5
			StartActivity(map)
		
		Case 7
			ExitApplication
		
	End Select
	
End Sub
Sub ArcMenu_LongClick(position As Int)
	ToastMessageShow("Item " & position & " LongClicked", False)

End Sub

Sub ArcMenu_AnimationEnd(Open As Boolean)
	'ToastMessageShow("AnimationEnded, Menu Open = " & Open, False)
End Sub
Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Sub Buttoninfo_Click
	Spotlightmenu.show
End Sub
Sub Activity_KeyPress (KeyCode As Int) As Boolean
	'Pressing the back key while the slidemenu is open will close it
	If KeyCode = KeyCodes.KEYCODE_BACK And sm.isVisible Then
		sm.Hide
		Return True
	End If

	'Pressing the menu key will open/close the slidemenu
	If KeyCode = KeyCodes.KEYCODE_MENU Then
		If sm.isVisible Then sm.Hide Else sm.Show
		Return True
	End If
	If ListView1.Visible=True Then
		ListView1.SetLayout(100%x,0%y,0dip,0dip)
		ListView1.Visible=False
		
	End If
	Return True
	
End Sub
Sub btnShow_Click
	sm.Show
End Sub





Sub Image1_Click
	
End Sub

Sub Button3_Click
	ListView1.Visible=True
	ListView1.BringToFront
	ListView1.SetLayoutAnimated(250,ListView1.Left,ListView1.Top,ListView1.Width,ListView1.SingleLineLayout.ItemHeight*4)
End Sub
Sub listview1_Closed
	ListView1.SetLayout(100%x,0%y,0dip,0dip)
	ListView1.Visible=False
	
End Sub



Sub ExitButton_Click

    
	Activity.Finish

End Sub
