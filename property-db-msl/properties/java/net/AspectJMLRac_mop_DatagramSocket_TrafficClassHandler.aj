import mop.*;
import org.aspectjml.ajmlrac.runtime.*;
import org.aspectjml.lang.annotation.*;
import org.aspectjml.lang.annotation.siesta.Before;
import org.aspectjml.lang.annotation.siesta.Before.*;
import java.util.Map;
import java.util.Map.Entry;


privileged aspect AspectJMLRac_mop_DatagramSocket_TrafficClassHandler$ddb5d1bb_23aa_4e1e_912c_ce1ce31c7b5d {

 declare precedence: AspectJMLRac$JMLRacPost4Project, AspectJMLRac_* , *;

  /** Generated by AspectJML to check the exceptional public postcondition of
   * method vioDatagramSocketSocket_TrafficClass. */
   after (final java.lang.String name, final boolean isStatic, final java.lang.Object[] args) throwing (Throwable rac$e) :
     call(static void mop.DatagramSocket_TrafficClassHandler.vioDatagramSocketSocket_TrafficClass(java.lang.String, boolean, java.lang.Object[])) && 
     !within(*..AspectJMLRac_*) && !within(AspectJMLRac_*) && args(name, isStatic, args) {
           JMLChecker.rethrowJMLAssertionError(rac$e, "mop.DatagramSocket_TrafficClassHandler.vioDatagramSocketSocket_TrafficClass(java.lang.String, boolean, java.lang.Object[])");
           boolean rac$b = true;
           String rac$ErrorMsg = "";

  		   if (true) {
  		     if (rac$e instanceof java.lang.RuntimeException) {
  			   java.lang.RuntimeException jml$ex = (java.lang.RuntimeException) rac$e;
  			   boolean rac$b1 = true;
  			   try{			     
  			     rac$b1 = true;
  			   }   catch (JMLNonExecutableException rac$nonExec) {
  			     throw new JMLEvaluationError("Invalid Expression in \"mop.DatagramSocket_TrafficClassHandler.java\" by method mop.DatagramSocket_TrafficClassHandler.vioDatagramSocketSocket_TrafficClass\nCaused by: "+rac$e);
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
               JMLChecker.checkExceptionalPostcondition(rac$b,"by method mop.DatagramSocket_TrafficClassHandler.vioDatagramSocketSocket_TrafficClass regarding code at \nFile \"mop.DatagramSocket_TrafficClassHandler.java\""+"\n\t"+rac$ErrorMsg+rac$e, "jml$ex", true, 1, "mop.DatagramSocket_TrafficClassHandler.vioDatagramSocketSocket_TrafficClass(java.lang.String, boolean, java.lang.Object[])", rac$e);
  		 }
  		   }
  	 }





  /** Generated by AspectJML to activate the SIESTA handler concer nchecking */
  @org.aspectj.lang.annotation.Aspect
  public static class AspectJMLInnerCC_mop_DatagramSocket_TrafficClassHandler{

  /** Generated by AspectJML/Siesta to check properties for
   * the Java members intercepted by @Before handler vioDatagramSocketSocket_TrafficClass. */
  @org.aspectj.lang.annotation.Before("call(* java.net.DatagramSocket.setTrafficClass(..))")
  public void vioDatagramSocketSocket_TrafficClass_Before(org.aspectj.lang.JoinPoint thisJP) {//#public static void mop.DatagramSocket_TrafficClassHandler.vioDatagramSocketSocket_TrafficClass(java.lang.String, boolean, java.lang.Object[])#'mop.DatagramSocket_TrafficClassHandler' (DatagramSocket_TrafficClassHandler.java:25)
    java.util.List argsList = new java.util.ArrayList(java.util.Arrays.asList(thisJP.getArgs()));
    argsList.add(0, thisJP.getTarget());
  mop.DatagramSocket_TrafficClassHandler.vioDatagramSocketSocket_TrafficClass(thisJP.getSignature().getName(), java.lang.reflect.Modifier.isStatic(thisJP.getSignature().getModifiers()), argsList.toArray());
  }

  }
}
