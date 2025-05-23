import mop.*;
import org.aspectjml.ajmlrac.runtime.*;
import org.aspectjml.lang.annotation.*;
import org.aspectjml.lang.annotation.siesta.Before;
import org.aspectjml.lang.annotation.siesta.Before.*;
import java.util.Map;
import java.util.Map.Entry;


privileged aspect AspectJMLRac_mop_ServerSocket_BacklogHandler$4f1f372e_1f6e_46c4_a827_72e8bb123e36 {

 declare precedence: AspectJMLRac$JMLRacPost4Project, AspectJMLRac_* , *;


  /** Generated by AspectJML to check the exceptional public postcondition of
   * method vioServerSocket_BacklogBind. */
   after (final java.lang.String name, final boolean isStatic, final java.lang.Object[] args) throwing (Throwable rac$e) :
     call(static void mop.ServerSocket_BacklogHandler.vioServerSocket_BacklogBind(java.lang.String, boolean, java.lang.Object[])) && 
     !within(*..AspectJMLRac_*) && !within(AspectJMLRac_*) && args(name, isStatic, args) {
           JMLChecker.rethrowJMLAssertionError(rac$e, "mop.ServerSocket_BacklogHandler.vioServerSocket_BacklogBind(java.lang.String, boolean, java.lang.Object[])");
           boolean rac$b = true;
           String rac$ErrorMsg = "";

  		   if (true) {
  		     if (rac$e instanceof java.lang.RuntimeException) {
  			   java.lang.RuntimeException jml$ex = (java.lang.RuntimeException) rac$e;
  			   boolean rac$b1 = true;
  			   try{			     
  			     rac$b1 = true;
  			   }   catch (JMLNonExecutableException rac$nonExec) {
  			     throw new JMLEvaluationError("Invalid Expression in \"mop.ServerSocket_BacklogHandler.java\" by method mop.ServerSocket_BacklogHandler.vioServerSocket_BacklogBind\nCaused by: "+rac$e);
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
               JMLChecker.checkExceptionalPostcondition(rac$b,"by method mop.ServerSocket_BacklogHandler.vioServerSocket_BacklogBind regarding code at \nFile \"mop.ServerSocket_BacklogHandler.java\""+"\n\t"+rac$ErrorMsg+rac$e, "jml$ex", true, 1, "mop.ServerSocket_BacklogHandler.vioServerSocket_BacklogBind(java.lang.String, boolean, java.lang.Object[])", rac$e);
  		 }
  		   }
  	 }


  /** Generated by AspectJML to check the exceptional public postcondition of
   * method vioServerSocket_BacklogNew. */
   after (final java.lang.String name, final boolean isStatic, final java.lang.Object[] args) throwing (Throwable rac$e) :
     call(static void mop.ServerSocket_BacklogHandler.vioServerSocket_BacklogNew(java.lang.String, boolean, java.lang.Object[])) && 
     !within(*..AspectJMLRac_*) && !within(AspectJMLRac_*) && args(name, isStatic, args) {
           JMLChecker.rethrowJMLAssertionError(rac$e, "mop.ServerSocket_BacklogHandler.vioServerSocket_BacklogNew(java.lang.String, boolean, java.lang.Object[])");
           boolean rac$b = true;
           String rac$ErrorMsg = "";

  		   if (true) {
  		     if (rac$e instanceof java.lang.RuntimeException) {
  			   java.lang.RuntimeException jml$ex = (java.lang.RuntimeException) rac$e;
  			   boolean rac$b1 = true;
  			   try{			     
  			     rac$b1 = true;
  			   }   catch (JMLNonExecutableException rac$nonExec) {
  			     throw new JMLEvaluationError("Invalid Expression in \"mop.ServerSocket_BacklogHandler.java\" by method mop.ServerSocket_BacklogHandler.vioServerSocket_BacklogNew\nCaused by: "+rac$e);
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
               JMLChecker.checkExceptionalPostcondition(rac$b,"by method mop.ServerSocket_BacklogHandler.vioServerSocket_BacklogNew regarding code at \nFile \"mop.ServerSocket_BacklogHandler.java\""+"\n\t"+rac$ErrorMsg+rac$e, "jml$ex", true, 1, "mop.ServerSocket_BacklogHandler.vioServerSocket_BacklogNew(java.lang.String, boolean, java.lang.Object[])", rac$e);
  		 }
  		   }
  	 }





  /** Generated by AspectJML to activate the SIESTA handler concer nchecking */
  @org.aspectj.lang.annotation.Aspect
  public static class AspectJMLInnerCC_mop_ServerSocket_BacklogHandler{

  /** Generated by AspectJML/Siesta to check properties for
   * the Java members intercepted by @Before handler vioServerSocket_BacklogBind. */
  @org.aspectj.lang.annotation.Before("call(* java.net.ServerSocket+.bind(..))")
  public void vioServerSocket_BacklogBind_Before(org.aspectj.lang.JoinPoint thisJP) {//#public static void mop.ServerSocket_BacklogHandler.vioServerSocket_BacklogBind(java.lang.String, boolean, java.lang.Object[])#'mop.ServerSocket_BacklogHandler' (ServerSocket_BacklogHandler.java:8)
    java.util.List argsList = new java.util.ArrayList(java.util.Arrays.asList(thisJP.getArgs()));
    argsList.add(0, thisJP.getTarget());
  mop.ServerSocket_BacklogHandler.vioServerSocket_BacklogBind(thisJP.getSignature().getName(), java.lang.reflect.Modifier.isStatic(thisJP.getSignature().getModifiers()), argsList.toArray());
  }

  /** Generated by AspectJML/Siesta to check properties for
   * the Java members intercepted by @Before handler vioServerSocket_BacklogNew. */
  @org.aspectj.lang.annotation.Before("call(java.net.ServerSocket.new(..))")
  public void vioServerSocket_BacklogNew_Before(org.aspectj.lang.JoinPoint thisJP) {//#public static void mop.ServerSocket_BacklogHandler.vioServerSocket_BacklogNew(java.lang.String, boolean, java.lang.Object[])#'mop.ServerSocket_BacklogHandler' (ServerSocket_BacklogHandler.java:12)
    java.util.List argsList = new java.util.ArrayList(java.util.Arrays.asList(thisJP.getArgs()));
    argsList.add(0, thisJP.getTarget());
  mop.ServerSocket_BacklogHandler.vioServerSocket_BacklogNew(thisJP.getSignature().getName(), java.lang.reflect.Modifier.isStatic(thisJP.getSignature().getModifiers()), argsList.toArray());
  }

  }
}
