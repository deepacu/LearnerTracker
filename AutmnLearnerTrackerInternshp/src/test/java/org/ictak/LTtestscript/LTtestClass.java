package org.ictak.LTtestscript;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

//import org.ictak.LTConstant.LTrConstant;
import org.ictak.LTpages.LTLoginPage;
import org.ictak.LTutilities.LTrExcelUtility;
 
import org.testng.Assert;
import org.testng.annotations.Test;


public class LTtestClass extends LTtestBase {
	
	LTLoginPage login ;
	
	@Test(priority=1)
	public void VerifyValidAdminLogin() throws IOException, InterruptedException
	{
		login= new LTLoginPage(driver);
		//String Username=LTrExcelUtility.getData(0, 0);
		//String Passwrd =  LTrExcelUtility.getData(0, 1);
		
		//login.setusername(Username);
		//login.setpassword(Passwrd);'
				
		login.UserNameAdmn();
	    login.PaswordAdmn();
		login.loginclick();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		String actualResult=login.getPage();
		Assert.assertEquals(actualResult,"LearnerTracker" );
		System.out.println(actualResult);
	}
	@Test(priority=2)
	
		public void  userAddclck() throws IOException, InterruptedException
		{
			login= new LTLoginPage(driver);
		//	String Username=LTrExcelUtility.getData(0, 0);
		//	String Passwrd =  LTrExcelUtility.getData(0, 1);
			
		//	login.setusername(Username);
		//	login.setpassword(Passwrd);
			login.UserNameAdmn();
			login.PaswordAdmn();
			login.loginclick();
			login.UserAddBtn();
			login.AdName();
			login.AdEmail();
			login.AdUserName();
			login.AdUserPassword();
			login.AdUserRole();
			login.SubmtBtn();
			
			
			
			
			
			
			
			
			/*String Usrname=LTrExcelUtility.getData(4, 0);
			String  UsrEmail=LTrExcelUtility.getData(4, 1);
			String UsrUsrName=LTrExcelUtility.getData(4, 2);
			String  Usrpswrd=LTrExcelUtility.getData(4, 3);
			String UsrRole=LTrExcelUtility.getData(4, 4);
			login.AdName(Usrname);
			login.AdEmail(UsrEmail);
			login.AdUserName(UsrUsrName);
			login.AdUserPassword(Usrpswrd);
			login.AdUserRole(UsrRole);*/
			
			
			 
			
			//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//	String actualResult=login.;
			//System.out.println(actualProd);
			//Assert.assertEquals(actualResult,LTrConstant. );
	}
	
	@Test(priority=3)
	
	public void  UserUpdate () throws IOException, InterruptedException
	{
		login= new LTLoginPage(driver);
		//String Username=LTrExcelUtility.getData(0, 0);
	//	String Passwrd =  LTrExcelUtility.getData(0, 1);
		
	//	login.setusername(Username);
	//	login.setpassword(Passwrd);
		login.UserNameAdmn();
		login.PaswordAdmn();
		login.loginclick();
		login.UserAddBtn();
		/*String Usrname=LTrExcelUtility.getData(4, 0);
		String  UsrEmail=LTrExcelUtility.getData(4, 1);
		String UsrUsrName=LTrExcelUtility.getData(4, 2);
		String  Usrpswrd=LTrExcelUtility.getData(4, 3);
		String UsrRole=LTrExcelUtility.getData(4, 4);
		login.AdName(Usrname);
		login.AdEmail(UsrEmail);
		login.AdUserName(UsrUsrName);
		login.AdUserPassword(Usrpswrd);
		login.AdUserRole(UsrRole);
		login.AdName();
		login.AdEmail();
		login.AdUserName();
		login.AdUserPassword();
		login.AdUserRole();*/
		login.SubmtBtn();
	    login.UpdateBtn();
	    login.AdmnDropdownClc();
	    login.AdmnLogout();
	}
		@Test(priority=4)
		
		public void UserDelete() throws IOException, InterruptedException
		{
			login= new LTLoginPage(driver);
		/*	String Username=LTrExcelUtility.getData(0, 0);
			String Passwrd =  LTrExcelUtility.getData(0, 1);
			
			login.setusername(Username);
			login.setpassword(Passwrd);*/
			login.UserNameAdmn();
			login.PaswordAdmn();
			login.loginclick();
		//	login.UserAddBtn();
		/*	String Usrname=LTrExcelUtility.getData(4, 0);
			String  UsrEmail=LTrExcelUtility.getData(4, 1);
			String UsrUsrName=LTrExcelUtility.getData(4, 2);
			String  Usrpswrd=LTrExcelUtility.getData(4, 3);
			String UsrRole=LTrExcelUtility.getData(4, 4);
			login.AdName(Usrname);
			login.AdEmail(UsrEmail);
			login.AdUserName(UsrUsrName);
			login.AdUserPassword(Usrpswrd);
			login.AdUserRole(UsrRole);*/
			/*	login.AdName();
			login.AdEmail();
			login.AdUserName();
			login.AdUserPassword();
			login.AdUserRole();
			login.SubmtBtn();
			//login.UpdateBtn();*/
			login.DeleteBtn();
			login.AdmnDropdownClc();
			login.AdmnLogout(); 
			 
				
		}
		
		
		
	
	@Test(priority=5)
	public void VerifyValidTrainingHeadLogin() throws IOException, InterruptedException
	{
		login= new LTLoginPage(driver);
		/*String Username=LTrExcelUtility.getData(1, 0);
		String Passwrd =  LTrExcelUtility.getData(1,1);
		
		login.setusername(Username);
		login.setpassword(Passwrd);	*/
		login.UserNameTrainer();
		login.PaswordTrainer();
		login.loginclick();
		 
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	//	String actualResult=login.;
		//System.out.println(actualProd);
		//Assert.assertEquals(actualResult,LTrConstant. );
	}
	@Test(priority=6)
	public void LearnerAdd() throws IOException, InterruptedException
	{
		login= new LTLoginPage(driver);
		/*String Username=LTrExcelUtility.getData(1, 0);
		String Passwrd =  LTrExcelUtility.getData(1,1);
		
		login.setusername(Username);
		login.setpassword(Passwrd);	*/
		login.UserNameTrainer();
		login.PaswordTrainer();
		login.loginclick();
	/*	String LTid=LTrExcelUtility.getData(5, 0);
		String LTName=LTrExcelUtility.getData(5, 1);
		String LTCourse=LTrExcelUtility.getData(5,2);
		String LTProject=LTrExcelUtility.getData(5, 3);
		String LTBatch=LTrExcelUtility.getData(5, 4);
		String LTCourseStatus=LTrExcelUtility.getData(5, 5);
		
		login.Learnerid(LTid);
		login.LearnerName(LTName);
		login.LearnerCourse(LTCourse);
		login.LearnerProject(LTProject);
		login.LearnerBatch(LTBatch);
		login .LearnerCourseStatus(LTCourseStatus);*/
		
		
		login.UserNameTrainer();
		login.PaswordTrainer();
		login.loginclick();
		login.Learnerid();
		login.LearnerName();
		login.LearnerCourse();
		login.LearnerProject();
		login.LearnerBatch();
		login.LearnerCourseStatus();
		
		
		login.LearnSubmitbtn();
		
		
		
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	//	String actualResult=login.;
		//System.out.println(actualProd);
		//Assert.assertEquals(actualResult,LTrConstant. );
	}
	
	@Test(priority=7)
	public void LearnerUpload() throws IOException, InterruptedException
	{
		login= new LTLoginPage(driver);
		/*	String Username=LTrExcelUtility.getData(1, 0);
		String Passwrd =  LTrExcelUtility.getData(1,1);
		
		login.setusername(Username);
		login.setpassword(Passwrd);	/
		login.UserNameTrainer();
		login.PaswordTrainer();
		login.loginclick();
		login.Learnerid();
		login.LearnerName();
		login.LearnerCourse();
		login.LearnerProject();
		login.LearnerBatch();
		login.LearnerCourseStatus();*/
		login.UserNameTrainer();
		login.PaswordTrainer();
		login.loginclick();
		login.learnerUpload();
	}
	@Test(priority=8)
	public void LearnerEdtBtnCLck() throws IOException, InterruptedException
	{
		login= new LTLoginPage(driver);
		/*	String Username=LTrExcelUtility.getData(1, 0);
		String Passwrd =  LTrExcelUtility.getData(1,1);
		
		login.setusername(Username);
		login.setpassword(Passwrd);	/
		login.UserNameTrainer();
		login.PaswordTrainer();
		login.loginclick();
		login.Learnerid();
		login.LearnerName();
		login.LearnerCourse();
		login.LearnerProject();
		login.LearnerBatch();
		login.LearnerCourseStatus();*/
		login.UserNameTrainer();
		login.PaswordTrainer();
		login.loginclick();
		login.LearnerEdit();
		login.LearnersBacktoDashBoard();
	}
	@Test(priority=9)
	public void LearnerDelete() throws IOException, InterruptedException
	{
		/*login= new LTLoginPage(driver);
		String Username=LTrExcelUtility.getData(1, 0);
		String Passwrd =  LTrExcelUtility.getData(1,1);
		
		login.setusername(Username);
		login.setpassword(Passwrd);	 
		login.UserNameTrainer();
		login.PaswordTrainer();
		login.loginclick();
		login.Learnerid();
		login.LearnerName();
		login.LearnerCourse();
		login.LearnerProject();
		login.LearnerBatch();
		login.LearnerCourseStatus();*/
		login.UserNameTrainer();
		login.PaswordTrainer();
		login.loginclick();
		
		login.LearnersDeleteBtn();
		 
	/*	String LTid=LTrExcelUtility.getData(5, 0);
		String LTName=LTrExcelUtility.getData(5, 1);
		String LTCourse=LTrExcelUtility.getData(5,2);
		String LTProject=LTrExcelUtility.getData(5, 3);
		String LTBatch=LTrExcelUtility.getData(5, 4);
		String LTCourseStatus=LTrExcelUtility.getData(5, 5);
		
		login.Learnerid(LTid);
		login.LearnerName(LTName);
		login.LearnerCourse(LTCourse);
		login.LearnerProject(LTProject);
		login.LearnerBatch(LTBatch);
		login .LearnerCourseStatus(LTCourseStatus);* /
		login.LearnSubmitbtn();
		login.DeleteBtn();
		
		
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	//	String actualResult=login.;
		//System.out.println(actualProd);
		//Assert.assertEquals(actualResult,LTrConstant. );*/
	}
	
	
	
	@Test(priority=10)
	public void LearnrDashBoard() throws IOException, InterruptedException
	{
		login= new LTLoginPage(driver);
		/*String Username=LTrExcelUtility.getData(1, 0);
		String Passwrd =  LTrExcelUtility.getData(1,1);
		
		login.setusername(Username);
		login.setpassword(Passwrd);	
		login.loginclick();
		String LTid=LTrExcelUtility.getData(5, 0);
		String LTName=LTrExcelUtility.getData(5, 1);
		String LTCourse=LTrExcelUtility.getData(5,2);
		String LTProject=LTrExcelUtility.getData(5, 3);
		String LTBatch=LTrExcelUtility.getData(5, 4);
		String LTCourseStatus=LTrExcelUtility.getData(5, 5);
		
		login.Learnerid(LTid);
		login.LearnerName(LTName);
		login.LearnerCourse(LTCourse);
		login.LearnerProject(LTProject);
		login.LearnerBatch(LTBatch);
		login .LearnerCourseStatus(LTCourseStatus);*/
		login.UserNameTrainer();
		login.PaswordTrainer();
		login.loginclick();
	/*/	login.Learnerid();
		login.LearnerName();
		login.LearnerCourse();
		login.LearnerProject();
		login.LearnerBatch();
		login.LearnerCourseStatus();*/
		
		//login.LearnSubmitbtn();
		//login.DeleteBtn();
		login.LearnersBacktoDashBoard();
		
		
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	//	String actualResult=login.;
		//System.out.println(actualProd);
		//Assert.assertEquals(actualResult,LTrConstant. );
	}
	
	
	@Test(priority=11)
	public void LearnrTranerClck() throws IOException, InterruptedException
	{

		login= new LTLoginPage(driver);
		login.UserNameTrainer();
		login.PaswordTrainer();
		login.loginclick();
		/*login.Learnerid();
		login.LearnerName();
		login.LearnerCourse();
		login.LearnerProject();
		login.LearnerBatch();
		login.LearnerCourseStatus();
		
		login.LearnSubmitbtn();*/
		//login.DeleteBtn();
		login.LearnersBacktoDashBoard();
		login.TrainerDropdownclk();
		login.TrainerLogout();
	}
	
	@Test(priority=12)
	public void LearnrTranerLogoutClck() throws IOException, InterruptedException
	{

		login= new LTLoginPage(driver);
		login.UserNameTrainer();
		login.PaswordTrainer();
		login.loginclick();
	/*	login.Learnerid();
		login.LearnerName();
		login.LearnerCourse();
		login.LearnerProject();
		login.LearnerBatch();
		login.LearnerCourseStatus();
		
		login.LearnSubmitbtn();
		//login.DeleteBtn();
		login.LearnersBacktoDashBoard();*/
		login.TrainerDropdownclk();
		login.TrainerLogout();
	}
	
	@Test(priority=13) 
	public void VerifyValidPlacementOffcerLogin() throws IOException, InterruptedException
	{
		login= new LTLoginPage(driver);
		/*String Username=LTrExcelUtility.getData(0, 4);
		String Passwrd =  LTrExcelUtility.getData(0, 5);
		
		login.setusername(Username);
		login.setpassword(Passwrd);	/*/
		login.UserNamePofficer();
		login.PaswordPofficer();
		login.loginclick();
		 
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	//	String actualResult=login.;
		//System.out.println(actualProd);
		//Assert.assertEquals(actualResult,LTrConstant. );
	}
	@Test (priority=14)
	public void PlacementOffcerUpdateClck() throws IOException, InterruptedException
	{
		login= new LTLoginPage(driver);
		/*String Username=LTrExcelUtility.getData(0, 4);
		String Passwrd =  LTrExcelUtility.getData(0, 5);
		
		login.setusername(Username);
		login.setpassword(Passwrd);	/*/
		login.UserNamePofficer();
		login.PaswordPofficer();
		login.loginclick();
		login.UpdateBtn();
		 
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	//	String actualResult=login.;
		//System.out.println(actualProd);
		//Assert.assertEquals(actualResult,LTrConstant. );
	}
	
	@Test (priority=15)
	public void PlacementOffcerUpdate() throws IOException, InterruptedException
	{
		login= new LTLoginPage(driver);
		/*String Username=LTrExcelUtility.getData(0, 4);
		String Passwrd =  LTrExcelUtility.getData(0, 5);
		
		login.setusername(Username);
		login.setpassword(Passwrd);	/*/
		login.UserNamePofficer();
		login.PaswordPofficer();
		login.loginclick();
		login.UpdateBtn();
	/*	String UpdtePlcmntLTid=LTrExcelUtility.getData(5, 0);
		String UpdtePlcmntLTName=LTrExcelUtility.getData(5, 1);
		String UpdtePlcmntLTCourse=LTrExcelUtility.getData(5,2);
		String UpdtePlcmntLTProject=LTrExcelUtility.getData(5, 3);
		String UpdtePlcmntLTBatch=LTrExcelUtility.getData(5, 4);
		String UpdtePlcmntLTCourseStatus=LTrExcelUtility.getData(5, 5);
		String PlcmntStatus=LTrExcelUtility.getData(0, 0);
		login.PlacmntLearnerid(UpdtePlcmntLTid);
		login.PlcmntLearnerName(UpdtePlcmntLTName);
		login.PlcmntLearnerCourse(UpdtePlcmntLTCourse);
		login.plcmntLearnerProject(UpdtePlcmntLTProject);
		login.PlcmntLearnerBatch(UpdtePlcmntLTBatch);
		login.PlcmntLearnerCourseStatus(UpdtePlcmntLTCourseStatus);
		login.PlacementStatus(PlcmntStatus);
		login.PlacmntLearnerid();
		login.PlcmntLearnerName();
		login.PlcmntLearnerCourse();
		login.plcmntLearnerProject();
		login.PlcmntLearnerBatch();
		login.PlcmntLearnerCourseStatus();
		login.PlacementStatus();*/
		
		
		login.PlcmntSubmtBtn();
		// if(plc)
		login.PlacemntBlacktoDashBrd();
		 
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	//	String actualResult=login.;
		//System.out.println(actualProd);
		//Assert.assertEquals(actualResult,LTrConstant. );
	}


	@Test (priority=16)
	public void PlacementOffcerDropdown() throws IOException, InterruptedException
	{
		login= new LTLoginPage(driver);
	//	login.setpassword(Passwrd);	
		login.UserNamePofficer();
		login.PaswordPofficer();
		login.loginclick();
       // login.PlacmntLearnerid();
	//	login.PlcmntLearnerName();
		//login.PlcmntLearnerCourse();
//		login.plcmntLearnerProject();
	//	login.PlcmntLearnerBatch();
//		login.PlcmntLearnerCourseStatus();
	//	login.PlacementStatus();
		
		
		//login.PlcmntSubmtBtn();
		// if(plc)
	//	login.PlacemntBlacktoDashBrd();
		login.PlacemntDropdown();
		login.PlacementLogout(); 
	}
	
	
}
