/**
 * 
 */
package newproject.test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

/**
 *
 * << Add Comments Here >>
 *
 * @author Girmiti Software
 * @date 07-Jul-2017 10:07:38 AM
 * @version 1.0
 */
public class Listeners implements ITestListener {

  /**
   * @param arg0
   */
  @Override
  public void onFinish(ITestContext arg0) {
    // TODO Auto-generated method stub
    
  }

  /**
   * @param arg0
   */
  @Override
  public void onStart(ITestContext arg0) {
    // TODO Auto-generated method stub
    
  }

  /**
   * @param arg0
   */
  @Override
  public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
    // TODO Auto-generated method stub
    
  }

  /**
   * @param arg0
   */
  @Override
  public void onTestFailure(ITestResult result) {
    // TODO Auto-generated method stub
    System.out.println("testcase"+result.getName()+ " has been failed"); 

  }

  /**
   * @param arg0
   */
  @Override
  public void onTestSkipped(ITestResult result) {
    // TODO Auto-generated method stub
    System.out.println("testcase " +result.getName()+" has been skipped"); 

  }

  /**
   * @param arg0
   */
  @Override
  public void onTestStart(ITestResult result) {
    // TODO Auto-generated method stub
   System.out.println("testcase " +result.getName()+" has been started"); 
  }

  /**
   * @param arg0
   */
  @Override
  public void onTestSuccess(ITestResult result) {
    // TODO Auto-generated method stub
    System.out.println("testcase "+result.getName()+" has been success"); 

  }

}
