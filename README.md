# MercikCucumberPOM

<a href="https://selenium.dev"><img src="https://selenium.dev/images/selenium_logo_square_green.png" width="180" alt="Selenium"/></a>
    

# About The Project
This project tests Mercik app using the selenium and cucumber frameworks.
## App Video



https://user-images.githubusercontent.com/57863133/209283653-0bc4127a-c982-49ed-b6f7-ac32743b9ca0.mp4




# How the Project Works
 To run the project, java must be installed on your computer. In addition, one of the ide like Eclipse or Intellij Idea must be installed.
 Then you can install and run the project on your computer by typing "git clone https://github.com/AbdurrahmanPulat/MercikCucumber.git" in the terminal.
  * [About The Project](#About-The-Project)
  * [App Video](#App_Video)
  * [How the Project Works](#How-The-Project-Works)
  * [Project Details](#Project-Details)
  * [Project Success Spark Report](#Project-Success-Spark-Report)
  * [Succes Scenario Report](#Succes-Scenario-Report)
  * [Succes TestNG Report](#Succes-TestNG-Report)
  * [Login Feature](#Login_Feature)
  * [AddProduct Feature](#AddOroduct-Feature)
  * [Project Failed Spark Report](#Project-Failed-Spark-Report)
  * [Failed Scenario Report](#Failed-Scenario-Report)
  * [Failed TestNG Report](#Failed-TestNG-Report)
  * [Failed Cucumber Timeline Report](#Failed-Cucumber-Timeline-Report)
  * [ParallelRun Java](#ParallelRun-Java)

  

## Project Details
- This project mercik application tests the interface, the application is successfully logged in and the homepage is verified.





## Project Success Spark Report

![MercikSparkReport](https://user-images.githubusercontent.com/57863133/209284141-ea0bdec6-c53a-4ada-9b1b-9f83a25cd7b1.png)

![MercikSparkReport2](https://user-images.githubusercontent.com/57863133/209284146-77545047-2fb7-41b6-bd2b-09d79562e875.png)


![MercikSparkReport3](https://user-images.githubusercontent.com/57863133/209284155-b69b52b7-beed-4b14-8078-35584eca66f0.png)


## Succes Scenario Report

[MercikPdf.pdf](https://github.com/AbdurrahmanPulat/MercikCucumberPOM/files/10292578/MercikPdf.pdf)
![MercikCucumberReport](https://user-images.githubusercontent.com/57863133/209284238-16fdd417-af1a-461f-8cdb-379175d0cdee.png)
![MercikCucumberReport2](https://user-images.githubusercontent.com/57863133/209284247-fcf6ad8a-f3a9-4e42-99ac-cc3f0f102823.png)
![MercikCucumberReport3](https://user-images.githubusercontent.com/57863133/209284253-162f9f0c-3323-4f77-9006-6aa8e355d394.png)
![MercikCucumberReport4](https://user-images.githubusercontent.com/57863133/209284270-ce1e2091-6053-443c-a44e-4c544e58ae18.png)



## Succes TestNG Report

![SuccesTestNG report](https://user-images.githubusercontent.com/57863133/207373827-dea549d7-a42d-49c0-ba2a-1e48dc75a863.png)

## Login Feature

@Smoke
Scenario: Login with correct credentials

- Given User is on login page
- When User enters username "taiko.example@gmail.com" 
- And User enters password "Test1234"
- And User cliks on Continue button
- Then User gets title of the page
- And Page title shoul be "Mercik Dashboard"


## ParallelRun Java

```java
package parallel;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;



@RunWith(Cucumber.class)
@CucumberOptions(
		
		plugin = {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/"	,
				"rerun:target/failed.rerun.txt"
		},
		
		features = {"src/test/resources/parallel"},
		glue = {"parallel"},
		monochrome = true
		)

public class parallelRun extends AbstractTestNGCucumberTests  {

	@Override
	@DataProvider(parallel = true)
	public Object [] [] scenarios(){
		return super.scenarios();
	}
}
```
