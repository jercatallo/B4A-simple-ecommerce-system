B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=10.7
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: True
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Private ImageView1 As ImageView
	Private ImageView2 As ImageView
	Private ImageView3 As ImageView
	Private ImageView4 As ImageView
	Private ImageView5 As ImageView
	Private ImageView6 As ImageView
	Private ImageView7 As ImageView
	Private ImageView8 As ImageView
	Private ImageView9 As ImageView
	Private txtprice As EditText
	Private TabHost1 As TabHost
	Private CheckBox3 As CheckBox
	Private CheckBox2 As CheckBox
	Private CheckBox1 As CheckBox
	Private CheckBox4 As CheckBox
	Private CheckBox5 As CheckBox
	Private CheckBox6 As CheckBox
	Private CheckBox7 As CheckBox
	Private CheckBox8 As CheckBox
	Private CheckBox9 As CheckBox
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	'Activity.LoadLayout("Layout1")
	Activity.LoadLayout("layClothes")
	txtprice.Text = 0
	TabHost1.AddTab("Blouse","layblouse.bal")
	TabHost1.AddTab("Pants","layshorts.bal")
	TabHost1.AddTab("Shorts","laypants.bal")
	ImageView1.Bitmap = LoadBitmap(File.DirAssets, "blouse1.jpg")
	ImageView2.Bitmap = LoadBitmap(File.DirAssets, "blouse2.jpg")
	ImageView3.Bitmap = LoadBitmap(File.DirAssets, "blouse3.jpg")
	ImageView4.Bitmap = LoadBitmap(File.DirAssets, "short1.jpg")
	ImageView5.Bitmap = LoadBitmap(File.DirAssets, "short2.jpg")
	ImageView6.Bitmap = LoadBitmap(File.DirAssets, "short3.jpg")
	ImageView7.Bitmap = LoadBitmap(File.DirAssets, "pants1.jpg")
	ImageView8.Bitmap = LoadBitmap(File.DirAssets, "pants2.jpg")
	ImageView9.Bitmap = LoadBitmap(File.DirAssets, "pants3.jpg")
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Private Sub btnhome_Click
	Activity.Finish
End Sub

Private Sub btnclear_Click
	CheckBox1.Checked=False
	CheckBox2.Checked=False
	CheckBox3.Checked=False
	CheckBox4.Checked=False
	CheckBox5.Checked=False
	CheckBox6.Checked=False
	CheckBox7.Checked=False
	CheckBox8.Checked=False
	CheckBox9.Checked=False
	txtprice.Text = 0
	ToastMessageShow("Cleared",True)
End Sub

Private Sub btnaccept_Click
	If txtprice.Text = 0 Then
		ToastMessageShow("Please Complete your order for Clothes", False)
	Else
		Main.priceforclothes = txtprice.Text
		Msgbox("Transaction for Clothes Confirmed","Successful")
		Activity.Finish
	End If
	
End Sub

Private Sub CheckBox3_CheckedChange(Checked As Boolean)
	If CheckBox3.Checked = True Then
		txtprice.Text = txtprice.Text + 400
	Else
		txtprice.Text = txtprice.Text - 400
	End If
End Sub

Private Sub CheckBox2_CheckedChange(Checked As Boolean)
	If CheckBox2.Checked = True Then
		txtprice.Text = txtprice.Text + 500
	Else
		txtprice.Text = txtprice.Text - 500
	End If
End Sub

Private Sub CheckBox1_CheckedChange(Checked As Boolean)
	If CheckBox1.Checked = True Then
		txtprice.Text = txtprice.Text + 300
	Else
		txtprice.Text = txtprice.Text - 300
	End If
End Sub

Private Sub CheckBox6_CheckedChange(Checked As Boolean)
	If CheckBox6.Checked = True Then
		txtprice.Text = txtprice.Text + 300
	Else
		txtprice.Text = txtprice.Text - 300
	End If
End Sub

Private Sub CheckBox5_CheckedChange(Checked As Boolean)
	If CheckBox5.Checked = True Then
		txtprice.Text = txtprice.Text + 200
	Else
		txtprice.Text = txtprice.Text - 200
	End If
End Sub

Private Sub CheckBox4_CheckedChange(Checked As Boolean)
	If CheckBox4.Checked = True Then
		txtprice.Text = txtprice.Text + 100
	Else
		txtprice.Text = txtprice.Text - 100
	End If
End Sub

Private Sub CheckBox9_CheckedChange(Checked As Boolean)
	If CheckBox9.Checked = True Then
		txtprice.Text = txtprice.Text + 600
	Else
		txtprice.Text = txtprice.Text - 600
	End If
End Sub

Private Sub CheckBox8_CheckedChange(Checked As Boolean)
	If CheckBox8.Checked = True Then
		txtprice.Text = txtprice.Text + 200
	Else
		txtprice.Text = txtprice.Text - 200
	End If
End Sub

Private Sub CheckBox7_CheckedChange(Checked As Boolean)
	If CheckBox7.Checked = True Then
		txtprice.Text = txtprice.Text + 500
	Else
		txtprice.Text = txtprice.Text - 500
	End If
End Sub