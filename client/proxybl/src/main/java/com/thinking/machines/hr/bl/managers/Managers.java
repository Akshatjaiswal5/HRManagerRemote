package com.thinking.machines.hr.bl.managers;
public class Managers {

 enum ManagerType {DESIGNATION,EMPLOYEE};
 public static ManagerType DESIGNATION=ManagerType.DESIGNATION;
 public static ManagerType EMPLOYEE=ManagerType.EMPLOYEE;

 public static String getManagerType(ManagerType managerType){
  if(managerType==DESIGNATION)
  return "DesignationManager";

  if(managerType==EMPLOYEE)
  return "EmployeeManager";

  return "";
 }

 public static String getAction(){

 }
 
}
