import stringbuilderexample.*;
import org.aspectjml.ajmlrac.runtime.*;
import org.aspectjml.lang.annotation.*;
import java.util.Map;
import java.util.Map.Entry;


privileged aspect AspectJMLRac_stringbuilderexample_StringBuilderSingleThreadDemo$772d18ce_2fbe_4015_a75c_281157bb1454 {

 declare precedence: AspectJMLRac$JMLRacPost4Project, AspectJMLRac_* , *;





  /** Generated by AspectJML to check the exceptional public postcondition of
   * method appending. */
  after (final stringbuilderexample.StringBuilderSingleThreadDemo object$rac) throwing (Throwable rac$e) :
     (call(void stringbuilderexample.StringBuilderSingleThreadDemo.appending())) && 
     !within(*..AspectJMLRac_*) && !within(AspectJMLRac_*) && target(object$rac) {
           JMLChecker.rethrowJMLAssertionError(rac$e, object$rac.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(object$rac))+".appending()");
           boolean rac$b = true;
           String rac$ErrorMsg = "";

  		   if (true) {
  		     if (rac$e instanceof java.lang.RuntimeException) {
  			   java.lang.RuntimeException jml$ex = (java.lang.RuntimeException) rac$e;
  			   boolean rac$b1 = true;
  			   try{			     
  			     rac$b1 = true;
  			   }   catch (JMLNonExecutableException rac$nonExec) {
  			     throw new JMLEvaluationError("Invalid Expression in \"stringbuilderexample.StringBuilderSingleThreadDemo.java\" by method stringbuilderexample.StringBuilderSingleThreadDemo.appending\nCaused by: "+rac$e);
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
               JMLChecker.checkExceptionalPostcondition(rac$b,"by method stringbuilderexample.StringBuilderSingleThreadDemo.appending regarding code at \nFile \"stringbuilderexample.StringBuilderSingleThreadDemo.java\""+"\n\t"+rac$ErrorMsg+rac$e, "jml$ex", true, 1, object$rac.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(object$rac))+".appending()", rac$e);
  		 }
  		   }
  	 }


  /** Generated by AspectJML to check the exceptional public postcondition of
   * method append. */
  after (final stringbuilderexample.StringBuilderSingleThreadDemo object$rac, final java.lang.String str) throwing (Throwable rac$e) :
     (call(void stringbuilderexample.StringBuilderSingleThreadDemo.append(java.lang.String))) && 
     !within(*..AspectJMLRac_*) && !within(AspectJMLRac_*) && target(object$rac) && args(str) {
           JMLChecker.rethrowJMLAssertionError(rac$e, object$rac.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(object$rac))+".append(java.lang.String)");
           boolean rac$b = true;
           String rac$ErrorMsg = "";

  		   if (true) {
  		     if (rac$e instanceof java.lang.RuntimeException) {
  			   java.lang.RuntimeException jml$ex = (java.lang.RuntimeException) rac$e;
  			   boolean rac$b1 = true;
  			   try{			     
  			     rac$b1 = true;
  			   }   catch (JMLNonExecutableException rac$nonExec) {
  			     throw new JMLEvaluationError("Invalid Expression in \"stringbuilderexample.StringBuilderSingleThreadDemo.java\" by method stringbuilderexample.StringBuilderSingleThreadDemo.append\nCaused by: "+rac$e);
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
               JMLChecker.checkExceptionalPostcondition(rac$b,"by method stringbuilderexample.StringBuilderSingleThreadDemo.append regarding code at \nFile \"stringbuilderexample.StringBuilderSingleThreadDemo.java\""+"\n\t"+rac$ErrorMsg+rac$e, "jml$ex", true, 1, object$rac.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(object$rac))+".append(java.lang.String)", rac$e);
  		 }
  		   }
  	 }


  /** Generated by AspectJML to check the exceptional public postcondition of
   * method appendBeginning. */
  after (final stringbuilderexample.StringBuilderSingleThreadDemo object$rac, final java.lang.String str) throwing (Throwable rac$e) :
     (call(void stringbuilderexample.StringBuilderSingleThreadDemo.appendBeginning(java.lang.String))) && 
     !within(*..AspectJMLRac_*) && !within(AspectJMLRac_*) && target(object$rac) && args(str) {
           JMLChecker.rethrowJMLAssertionError(rac$e, object$rac.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(object$rac))+".appendBeginning(java.lang.String)");
           boolean rac$b = true;
           String rac$ErrorMsg = "";

  		   if (true) {
  		     if (rac$e instanceof java.lang.RuntimeException) {
  			   java.lang.RuntimeException jml$ex = (java.lang.RuntimeException) rac$e;
  			   boolean rac$b1 = true;
  			   try{			     
  			     rac$b1 = true;
  			   }   catch (JMLNonExecutableException rac$nonExec) {
  			     throw new JMLEvaluationError("Invalid Expression in \"stringbuilderexample.StringBuilderSingleThreadDemo.java\" by method stringbuilderexample.StringBuilderSingleThreadDemo.appendBeginning\nCaused by: "+rac$e);
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
               JMLChecker.checkExceptionalPostcondition(rac$b,"by method stringbuilderexample.StringBuilderSingleThreadDemo.appendBeginning regarding code at \nFile \"stringbuilderexample.StringBuilderSingleThreadDemo.java\""+"\n\t"+rac$ErrorMsg+rac$e, "jml$ex", true, 1, object$rac.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(object$rac))+".appendBeginning(java.lang.String)", rac$e);
  		 }
  		   }
  	 }


  /** Generated by AspectJML to check the exceptional public postcondition of
   * method getStringBuilderContent. */
  after (final stringbuilderexample.StringBuilderSingleThreadDemo object$rac) throwing (Throwable rac$e) :
     (call(java.lang.String stringbuilderexample.StringBuilderSingleThreadDemo.getStringBuilderContent())) && 
     !within(*..AspectJMLRac_*) && !within(AspectJMLRac_*) && target(object$rac) {
           JMLChecker.rethrowJMLAssertionError(rac$e, object$rac.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(object$rac))+".getStringBuilderContent()");
           boolean rac$b = true;
           String rac$ErrorMsg = "";

  		   if (true) {
  		     if (rac$e instanceof java.lang.RuntimeException) {
  			   java.lang.RuntimeException jml$ex = (java.lang.RuntimeException) rac$e;
  			   boolean rac$b1 = true;
  			   try{			     
  			     rac$b1 = true;
  			   }   catch (JMLNonExecutableException rac$nonExec) {
  			     throw new JMLEvaluationError("Invalid Expression in \"stringbuilderexample.StringBuilderSingleThreadDemo.java\" by method stringbuilderexample.StringBuilderSingleThreadDemo.getStringBuilderContent\nCaused by: "+rac$e);
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
               JMLChecker.checkExceptionalPostcondition(rac$b,"by method stringbuilderexample.StringBuilderSingleThreadDemo.getStringBuilderContent regarding code at \nFile \"stringbuilderexample.StringBuilderSingleThreadDemo.java\", line 23 (stringbuilderexample.StringBuilderSingleThreadDemo.java:23)"+"\n\t"+rac$ErrorMsg+rac$e, "jml$ex", true, 1, object$rac.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(object$rac))+".getStringBuilderContent()", rac$e);
  		 }
  		   }
  	 }


  /** Generated by AspectJML to check the exceptional public postcondition of
   * method main. */
   after (final java.lang.String[] args) throwing (Throwable rac$e) :
     call(static void stringbuilderexample.StringBuilderSingleThreadDemo.main(java.lang.String[])) && 
     !within(*..AspectJMLRac_*) && !within(AspectJMLRac_*) && args(args) {
           JMLChecker.rethrowJMLAssertionError(rac$e, "stringbuilderexample.StringBuilderSingleThreadDemo.main(java.lang.String[])");
           boolean rac$b = true;
           String rac$ErrorMsg = "";

  		   if (true) {
  		     if (rac$e instanceof java.lang.RuntimeException) {
  			   java.lang.RuntimeException jml$ex = (java.lang.RuntimeException) rac$e;
  			   boolean rac$b1 = true;
  			   try{			     
  			     rac$b1 = true;
  			   }   catch (JMLNonExecutableException rac$nonExec) {
  			     throw new JMLEvaluationError("Invalid Expression in \"stringbuilderexample.StringBuilderSingleThreadDemo.java\" by method stringbuilderexample.StringBuilderSingleThreadDemo.main\nCaused by: "+rac$e);
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
               JMLChecker.checkExceptionalPostcondition(rac$b,"by method stringbuilderexample.StringBuilderSingleThreadDemo.main regarding code at \nFile \"stringbuilderexample.StringBuilderSingleThreadDemo.java\""+"\n\t"+rac$ErrorMsg+rac$e, "jml$ex", true, 1, "stringbuilderexample.StringBuilderSingleThreadDemo.main(java.lang.String[])", rac$e);
  		 }
  		   }
  	 }




}
