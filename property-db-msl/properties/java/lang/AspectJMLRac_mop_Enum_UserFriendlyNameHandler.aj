import mop.*;
import org.aspectjml.ajmlrac.runtime.*;
import org.aspectjml.lang.annotation.*;
import org.aspectjml.lang.annotation.siesta.Before;
import org.aspectjml.lang.annotation.siesta.Before.*;
import java.util.Map;
import java.util.Map.Entry;


privileged aspect AspectJMLRac_mop_Enum_UserFriendlyNameHandler$20304577_e3c6_4956_b344_51c43cef337a {

 declare precedence: AspectJMLRac$JMLRacPost4Project, AspectJMLRac_* , *;

  /** Generated by AspectJML to check the exceptional public postcondition of
   * method vioEnum_UserFriendlyName. */
   after (final java.lang.Enum eenum) throwing (Throwable rac$e) :
     call(static void mop.Enum_UserFriendlyNameHandler.vioEnum_UserFriendlyName(java.lang.Enum)) && 
     !within(*..AspectJMLRac_*) && !within(AspectJMLRac_*) && args(eenum) {
           JMLChecker.rethrowJMLAssertionError(rac$e, "mop.Enum_UserFriendlyNameHandler.vioEnum_UserFriendlyName(java.lang.Enum)");
           boolean rac$b = true;
           String rac$ErrorMsg = "";

  		   if (true) {
  		     if (rac$e instanceof java.lang.RuntimeException) {
  			   java.lang.RuntimeException jml$ex = (java.lang.RuntimeException) rac$e;
  			   boolean rac$b1 = true;
  			   try{			     
  			     rac$b1 = true;
  			   }   catch (JMLNonExecutableException rac$nonExec) {
  			     throw new JMLEvaluationError("Invalid Expression in \"mop.Enum_UserFriendlyNameHandler.java\" by method mop.Enum_UserFriendlyNameHandler.vioEnum_UserFriendlyName\nCaused by: "+rac$e);
  			   }
  			   if(!rac$b1) {
  			     if(rac$ErrorMsg.equals("")) {
  			       rac$ErrorMsg = "jml$ex";
  			     }
  			     else {
  			       rac$ErrorMsg += " and jml$ex";
  			     }
  			   }
  			   rac$b = rac$b && rac$b1;
           if(rac$ErrorMsg.indexOf("and") >= 0 ){
             rac$ErrorMsg += " are ";
           }
           else{
             rac$ErrorMsg += " is ";
           }
               JMLChecker.checkExceptionalPostcondition(rac$b,"by method mop.Enum_UserFriendlyNameHandler.vioEnum_UserFriendlyName regarding code at \nFile \"mop.Enum_UserFriendlyNameHandler.java\""+"\n\t"+rac$ErrorMsg+rac$e, "jml$ex", true, 1, "mop.Enum_UserFriendlyNameHandler.vioEnum_UserFriendlyName(java.lang.Enum)", rac$e);
  		 }
  		   }
  	 }





  /** Generated by AspectJML to activate the SIESTA handler concer nchecking */
  @org.aspectj.lang.annotation.Aspect
  public static class AspectJMLInnerCC_mop_Enum_UserFriendlyNameHandler{

  /** Generated by AspectJML/Siesta to check properties for
   * the Java members intercepted by @Before handler vioEnum_UserFriendlyName. */
  @org.aspectj.lang.annotation.Before("(call(* java.lang.Enum+.name()) && target(java.lang.Enum))")
  public void vioEnum_UserFriendlyName_Before(org.aspectj.lang.JoinPoint thisJP) {//#public static void mop.Enum_UserFriendlyNameHandler.vioEnum_UserFriendlyName(java.lang.Enum)#'mop.Enum_UserFriendlyNameHandler' (Enum_UserFriendlyNameHandler.java:17)
  mop.Enum_UserFriendlyNameHandler.vioEnum_UserFriendlyName((java.lang.Enum)thisJP.getTarget());
  }

  }
}
