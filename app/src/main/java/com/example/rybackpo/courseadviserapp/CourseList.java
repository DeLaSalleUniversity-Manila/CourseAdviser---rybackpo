package com.example.rybackpo.courseadviserapp;

import java.util.ArrayList;
import java.util.List;

public class CourseList{

    List<String> getCourses(String selectedterm){

        List<String> courselist = new ArrayList<String>();

        if(selectedterm.equals("1st Year, 1st Term")){
            courselist.add("FITWELL");
            courselist.add("INTRICT");
            courselist.add("INTRPRG");
            courselist.add("ISMATH1");
            courselist.add("LBYENVC");
            courselist.add("PERSEF1");
            courselist.add("SCIENVC");
        }
        else if(selectedterm.equals("1st Year, 2nd Term")){
            courselist.add("DASTRAP");
            courselist.add("ENGLCOM");
            courselist.add("FORMDEV");
            courselist.add("FTSPORT");
            courselist.add("ISMATH2");
            courselist.add("LASARE1");
            courselist.add("ORG-MGT");
            courselist.add("TREDONE");
        }
        else if(selectedterm.equals("1st Year, 3rd Term")){
            courselist.add("ENGLRES");
            courselist.add("FILDLAR");
            courselist.add("FTDANCE");
            courselist.add("GREATWK");
            courselist.add("INTFILO");
            courselist.add("KASPIL1");
        }
        else if(selectedterm.equals("2nd Year, 1st Term")){
            courselist.add("CHEMONE");
            courselist.add("ENGALG1");
            courselist.add("ENGTRIG");
            courselist.add("FTTEAMS");
            courselist.add("GRAPONE");
            courselist.add("LASARE2");
            courselist.add("LBYCH11");
            courselist.add("SOCTEC1");
            courselist.add("SPEECOM");
        }
        else if(selectedterm.equals("2nd Year, 2nd Term")){
            courselist.add("ANAGEOM");
            courselist.add("DIFFCAL");
            courselist.add("ENGSAFE");
            courselist.add("KASPIL2");
            courselist.add("LBYEC71");
            courselist.add("SOLIMEN");
            courselist.add("TREDTWO");
        }
        else if(selectedterm.equals("2nd Year, 3rd Term")){
            courselist.add("ENGALG2");
            courselist.add("ENGPHY1");
            courselist.add("ENVIRON");
            courselist.add("HUMAART");
            courselist.add("INTECAL");
            courselist.add("LBYMEEA");
            courselist.add("LBYPH11");
        }
        else if(selectedterm.equals("3rd Year, 1st Term")){
            courselist.add("ENGIANA");
            courselist.add("ENGPHY2");
            courselist.add("LBYEC72");
            courselist.add("LBYPH12");
            courselist.add("SOCTEC2");
            courselist.add("STATICS");
            courselist.add("TREDTRI");
        }
        else if(selectedterm.equals("3rd Year, 2nd Term")){
            courselist.add("BASICEE");
            courselist.add("DISMATH");
            courselist.add("DYNAMIC");
            courselist.add("ENTHERM");
            courselist.add("HUMALIT");
            courselist.add("LBYCP3D");
            courselist.add("PERSEF2");
        }
        else if(selectedterm.equals("3rd Year, 3rd Term")){
            courselist.add("ADVDEE");
            courselist.add("COMMATH");
            courselist.add("DATASAL");
            courselist.add("ECONENG");
            courselist.add("ELEMECE");
            courselist.add("IPERSEF");
            courselist.add("LASARE3");
            courselist.add("LBYCP12");
            courselist.add("LBYCP1A");
            courselist.add("LBYCP27");
            courselist.add("LBYEC1B");
        }
        else if(selectedterm.equals("3rd Year, 3rd Term")){
            courselist.add("ADVDEE");
            courselist.add("COMMATH");
            courselist.add("DATASAL");
            courselist.add("ECONENG");
            courselist.add("ELEMECE");
            courselist.add("IPERSEF");
            courselist.add("LASARE3");
            courselist.add("LBYCP12");
            courselist.add("LBYCP1A");
            courselist.add("LBYCP27");
            courselist.add("LBYEC1B");
        }
        else if(selectedterm.equals("Special Term")){
            courselist.add("ENGSTAT");
            courselist.add("MEDEFOR");
        }
        else if(selectedterm.equals("4th Year, 1st Term")){
            courselist.add("ADVECE");
            courselist.add("CPEPROG");
            courselist.add("LBYCP1B");
            courselist.add("LBYCP1F");
            courselist.add("LBYCP24");
            courselist.add("LBYEC1C");
            courselist.add("LOGICKT");
            courselist.add("SIGPROC");
        }
        return courselist;
    }
}
