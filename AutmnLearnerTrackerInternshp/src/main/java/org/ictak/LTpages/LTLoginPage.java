package org.ictak.LTpages;
 import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
 
 
 public class LTLoginPage {
	 WebDriver driver;
	 
	private WebElement username;
		private WebElement passw;
		private WebElement logina;
		private WebElement Usradd;
		private WebElement name;
		private WebElement  email;
	 	private WebElement Addusern;
	 	private WebElement Addpassword;
	 	private WebElement AddRole;
	 	private WebElement submit;
	 	private WebElement update;
	 	private WebElement delete;
	    private WebElement	Lrnrid;
	    private WebElement LrnName;
	    private WebElement LrnCourse;
	    private WebElement LrnProject;
	    private WebElement LrnBatch;
	    private WebElement LrnCourseStatus;
	    private WebElement Lsubmit;
	    private WebElement LDashBoard;
	    private WebElement Plupdate;
	    private WebElement UpdteLrnrid;
	    private WebElement  updteLrnName;
	    private WebElement updteLrnCourse;
	    private WebElement updteLrnProject;
	    private WebElement  updteLrnBatch;
	    private WebElement updteLrnCourseStatus;
	    private WebElement  plcmntstatus;
	    private WebElement   Plcmntsubmit;
	    
	    private WebElement  PlcmntBcktoDashBrd;
	    
	    
	    
		public LTLoginPage(WebDriver driver)
		{
			this.driver=driver;
		}
	/*	public void setusername(String setUser) {
			username = driver.findElement(By.id("Username"));
			username.sendKeys(setUser);
		}

		public void setpassword(String passwordstr) {
			passw = driver.findElement(By. id("pass"));
			passw.sendKeys(passwordstr); 
		}*/
		public void UserNameAdmn() {
			
			driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("admin");
			
		}
public void PaswordAdmn() {
			
			driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin@123");
			
		}
public void UserNameTrainer() {
	
	driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("trainer");
	
}
public void PaswordTrainer() {
	
	driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("trainer@123");
	
}
public void UserNamePofficer() {
	
	driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("pofficer");
	
}
public void PaswordPofficer() {
	
	driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("pofficer@123");
	
}	 
		
		public void loginclick() {
			logina = driver.findElement(By.xpath("//button[@class=\"btn btn-success w-100\"]"));
			logina.click();
		}
		public String getPage()
		{
			
			return (driver.findElement(By.xpath("//a[@class=\"navbar-brand\" and' LearnerTracker']")).getText());
		}
		 
		
		
		
		public void UserAddBtn() {
			Usradd=driver.findElement(By.xpath( "//button[@class=\"mb-3 btn btn-success\"]"));
			Usradd.click();
			
		}
		public void AdName()
		{
			 driver.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys("Deepa");
			
		}
		public void AdEmail() {
		
			driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("deepa@gmail.com");
			
		}
		public void AdUserName()
		{
			driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("Deepa");
				
		}
		public void AdUserPassword() {
			
			
			driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("Deepa@123");
		}
		public void AdUserRole()
		{
			driver.findElement(By.xpath("//select[@class=\"form-select required\"]")).sendKeys("Admin");
		}
		
		
		/*public void AdName(String setName) {
			name = driver.findElement(By.id("Addname"));
			name.sendKeys(setName);
		}
		public void AdEmail(String setemail) {
			email = driver.findElement(By.id("AddEmail"));
			email.sendKeys(setemail);
		}
		public void AdUserName(String setUserName) {
			Addusern = driver.findElement(By.id("AddUserName"));
			Addusern.sendKeys(setUserName);
		}
		public void AdUserPassword(String setUserpassword) {
			Addpassword = driver.findElement(By.id("AddUserpassword"));
			Addpassword.sendKeys(setUserpassword);
		}
		public void AdUserRole(String setUserRole) {
			  AddRole = driver.findElement(By.id("AddUserRole"));
			AddRole.sendKeys(setUserRole);
		}*/
		
		public void SubmtBtn() {
			 submit = driver.findElement(By.xpath("//button[@class=\"btn btn-success\"]"));
			 submit.click();
			
		}
		public void UpdateBtn()
		{
			update =driver.findElement(By.xpath("(//button[@class=\"btn btn-success btn btn-primary\"])[4]"));
		update.click();
			
		}
		public void  AdmnBactoDashBrd()
		{
			driver.findElement(By.xpath("//button[@class=\"btn btn-warning\"]")).click();
		 
			
		}
	 
		public void DeleteBtn() {
			
			
			// driver.find_elements(By.XPATH, '//div[@class="profile-detail"]//button')
			
			delete=driver.findElement(By.xpath("(//button[@class=\"btn btn-danger btn btn-primary\"])[4]" ));
			delete.click();
		}
		
		public void AdmnDropdownClc()
		{
			
			driver.findElement(By.xpath("//a[@id=\"basic-nav-dropdown\"]")).click();
		}
		
		public void AdmnLogout()
		{
		
			driver.findElement(By.xpath("  //a[normalize-space()='Logout']")).click();
			
		}
		
		
		
		public void AddLearners()
		{
			driver.findElement(By.xpath("//a[@href='/tadd']")).click();
				
		}
		public void  Learnerid()
		{
			driver.findElement(By.xpath("//input[@id=\"learnerid\"]")).sendKeys("LI");
		}
		public void LearnerName() {
			
			driver.findElement(By.xpath("//input[@name=\"name\"]")).sendKeys( "deepa ");
		}
		
		public void LearnerCourse()
		{
			driver.findElement(By.xpath("//select[@name=\"course\"]")).sendKeys( "ST");
		}
		
		public void LearnerProject()
		{
		
		
			driver.findElement(By.xpath("//select[@name=\"project\"]")).sendKeys( "ICTAK");
		}
		public void LearnerBatch()
		
		{
			driver.findElement(By.xpath("//select[@name=\"batch\"]")).sendKeys( "Mar_23");
			
		}
		public void LearnerCourseStatus()
		{
			driver.findElement(By.xpath("//select[@name=\"cstatus\"]")).sendKeys( "Qualified");
			
		}
		
	/*	public void  Learnerid(String setLid) {
			 Lrnrid = driver.findElement(By.id("LId"));
			 Lrnrid.sendKeys(setLid);
		}
		public void LearnerName(String setLrnName)
		{
			LrnName=driver.findElement(By.id("Name"));
			LrnName.sendKeys(setLrnName);
			
		}
		public void LearnerCourse(String setLrnCourse)
		{
			LrnCourse=driver.findElement(By.id("Course"));
			LrnCourse.sendKeys(setLrnCourse);
			
		}
		public void LearnerProject(String setLrnProject)
		{
			LrnProject=driver.findElement(By.id("Course"));
			LrnProject.sendKeys(setLrnProject);
			
		}
		public void LearnerBatch(String setLrnBatch)
		{
			LrnBatch=driver.findElement(By.id("Batch"));
			LrnBatch.sendKeys(setLrnBatch);
			
		}
		public void LearnerCourseStatus(String setLrnCourseStatus)
		{
			LrnCourseStatus=driver.findElement(By.id("CourseStatus"));
			LrnCourseStatus.sendKeys(setLrnCourseStatus);
			
		}*/
		public void LearnSubmitbtn()
		{
			Lsubmit=driver.findElement(By.xpath("//button[@class=\"btn btn-success\"]"));
			Lsubmit.click();
		}
		public void LearnersBacktoDashBoard()
		{
			LDashBoard=driver.findElement(By.xpath("//button[@class=\"btn btn-warning\"]"));
			LDashBoard.click();
			
		}
		public void LearnerEdit()
		{
			driver.findElement(By.xpath("(//button[@class=\"btn btn-success\"])[4]")).click(); 
		}
		public void LearnersDeleteBtn() {
			
			driver.findElement(By.xpath("(//button[@class=\"btn btn-danger\"])[4]")).click();
			
			
		}
		
		public void learnerUpload() {
			
			driver.findElement(By.xpath("//a[@href=\"/upload\"] ")).click();
		}
public void learnerUploadCancel() {
			
			driver.findElement(By.xpath("//button[@class=\"ui mini button\"] ")).click();
		}
		
		
		public void TrainerDropdownclk()
		{
			driver.findElement(By.xpath("//a[@id=\"basic-nav-dropdown\"]")).click();
		}
		public void TrainerLogout()
		{
			driver.findElement(By.xpath(" //a[normalize-space()='Logout']")).click();	
		}
		
				
	
		/*public void PlacmntLearnerid()
		{
			 driver.findElement(By.xpath("//input[@name=\"learnerid\"]")).sendKeys( "89");	
		} 
		
		public void PlcmntLearnerName()
		{
			driver.findElement(By.xpath("//input[@name=\"name\"]")).sendKeys("Chris");	
			
		}
		public void PlcmntLearnerCourse() {
			
			driver.findElement(By.xpath("// select[@name=\"course\"]")).sendKeys("RPA");
			
		}
		public void plcmntLearnerProject() {
			
			driver.findElement(By.xpath("// select[@name=\"project\"]")).sendKeys("ABCD");
			
		}
		public void PlcmntLearnerBatch()
		{
			//driver.findElement(By.xpath("")).sendKeys("");
			
			
			driver.findElement(By.xpath("// select[@name=\"batch\"]")).sendKeys("May_22");
		}
		public void PlcmntLearnerCourseStatus()
		{
			driver.findElement(By.xpath("// select[@name=\"cstatus\"]")).sendKeys("Qualified");
		}*/
		
		public void PlacementStatus()
		{
			driver.findElement(By.xpath("// select[@name=\"pstatus\"]")).sendKeys("Placed ");
			
		}
		
	/*	public void PlacmntLearnerid(String setupdteLid) {
			UpdteLrnrid = driver.findElement(By.id("UpdteLId"));
			UpdteLrnrid.sendKeys(setupdteLid);
		}
		public void PlcmntLearnerName(String setupdteLrnName)
		{
			updteLrnName=driver.findElement(By.id("UpdteName"));
			updteLrnName.sendKeys(setupdteLrnName);
			
		}
		public void PlcmntLearnerCourse(String setupdteLrnCourse)
		{
			updteLrnCourse=driver.findElement(By.id("UpdteCourse"));
			updteLrnCourse.sendKeys(setupdteLrnCourse);
			
		}
		public void plcmntLearnerProject(String setUpdteLrnProject)
		{
			updteLrnProject=driver.findElement(By.id("UpdteCourse"));
			updteLrnProject.sendKeys(setUpdteLrnProject);
			
		}
		public void PlcmntLearnerBatch(String setUpdteLrnBatch)
		{
			updteLrnBatch=driver.findElement(By.id("UpdteBatch"));
			updteLrnBatch.sendKeys(setUpdteLrnBatch);
			
		}
		public void PlcmntLearnerCourseStatus(String setUpdteLrnCourseStatus)
		{
			updteLrnCourseStatus=driver.findElement(By.id("UpdteCourseStatus"));
			updteLrnCourseStatus.sendKeys(setUpdteLrnCourseStatus);
			
		}
		public void PlacementStatus(String setPlacementstatus)
		{
			plcmntstatus=driver.findElement(By.id("UpdtePlacmntstatus" ));
			plcmntstatus.sendKeys(setPlacementstatus);
		}*/
		
		
		public void PlcmntSubmtBtn()
		{
			Plcmntsubmit=driver.findElement(By.xpath("//button[@class=\"btn btn-success\"]"));
			Plcmntsubmit.click();
		}
		public void PlacemntBlacktoDashBrd()
		{
			PlcmntBcktoDashBrd=driver.findElement(By.xpath("//button[@class=\"btn btn-warning\"]"));
			PlcmntBcktoDashBrd.click();
		}
		public void PlacemntUpdateBtn()
		{
			Plupdate=driver.findElement(By.xpath("(//button[@class=\"btn btn-success btn btn-primary\"])[4] "));
			Plupdate.click();
			
		}
		public void PlacemntDropdown()
		{
		
			driver.findElement(By.xpath("//a[@id=\"basic-nav-dropdown\"]")).click();
		}
		public void PlacementLogout() {
			
			driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
			
		}
		
		
	}
	 


