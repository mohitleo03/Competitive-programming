import java.util.*;

public class team{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int day = 0;
        String cont = scan.nextLine();
        String[] cp = cont.split(" ");
        int C = Integer.parseInt(cp[0]);
        int P = Integer.parseInt(cp[1]);
        contributer[] contributers = new contributer[100000];
        for(int i = 0 ; i< C ; i++){
            contributers[i] = new contributer();
        }
        for(int i = 0 ; i< C ; i++){
            String a = scan.nextLine();
            String[] b = a.split(" ");
            contributers[i].name = b[0];
            contributers[i].no_skills = Integer.parseInt(b[1]);
            for(int j = 0 ; j < Integer.parseInt(b[1]) ; j++){
                String skill = scan.nextLine();
                String[] sk = skill.split(" ");
                contributers[i].skills[j].skill_name = sk[0];
                contributers[i].skills[j].skill_level = Integer.parseInt(sk[1]);
            }
        }
        project[] projects = new project[100000];
        for(int i = 0 ; i< C ; i++){
            projects[i] = new project();
        }
        for( int i = 0 ; i < P ; i++){
            String proj = scan.nextLine();
            String[] project = proj.split(" ");
            projects[i].project_name = project[0];
            projects[i].completion = Integer.parseInt(project[1]);
            projects[i].score = Integer.parseInt(project[2]);
            projects[i].best_before = Integer.parseInt(project[3]);
            projects[i].no_roles= Integer.parseInt(project[4]);
            for( int j = 0 ; j < Integer.parseInt(project[4]) ; j++){
                String skill = scan.nextLine();
                String[] sk = skill.split(" ");
                projects[i].roles[j].skill_name = sk[0];
                projects[i].roles[j].skill_level = Integer.parseInt(sk[1]);
            };
        }
        scan.close();
        for( int i = 0 ; i < P ; i++ ){
            for( int j = 1 ; j < (P-i) ; j++ ){
                if(projects[j-1].best_before>projects[j].best_before){
                    project temp = projects[j-1];
                    projects[j-1] = projects[j];
                    projects[j] = temp;
                }
            }
        }
        int role_completed = 0;
        for(int i = 0 ; i < P ; i++){
            for( int j = 0 ; j < projects[i].no_roles ; j++){
                for(int k = 0 ; k < C ; k++){
                    for( int l = 0 ; l < contributers[k].no_skills ; l++){
                        if(projects[i].roles[j].skill_name == contributers[k].skills[l].skill_name && projects[i].roles[j].skill_level >= contributers[k].skills[l].skill_level){
                            role_completed++;
                        }
                        else if(projects[i].roles[j].skill_name == contributers[k].skills[l].skill_name && projects[i].roles[j].skill_level-1 == contributers[k].skills[l].skill_level){
                            for(int m = 0 ; m < C ; m++){
                                for( int n = 0 ; n < contributers[m].no_skills ; n++){
                                    if(projects[i].roles[j].skill_name == contributers[m].skills[n].skill_name && projects[i].roles[j].skill_level >= contributers[m].skills[n].skill_level){
                                        role_completed++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if(role_completed==projects[i].no_roles){
                day+=projects[i].completion;
            }
        }
        for(int i = 0; i< P ; i++){
            System.out.println(projects[i].project_name);
        }
    }
}

class project{
    String project_name;
    int completion;
    int score;
    int best_before;
    int no_roles;
    skill[] roles = new skill[100];
    project(){
        project_name = "";
        completion = 0;
        score = 0;
        best_before = 0;
        no_roles = 0;
        for(int i = 0 ; i < 100 ; i++){
            roles[i] = new skill();
        }
    }
}

class skill{
    String skill_name;
    int skill_level;
}

class contributer{
    String name;
    int no_skills;
    skill[] skills = new skill[100];
    contributer(){
        name = "";
        no_skills = 0;
        for(int i = 0 ; i < 100 ; i++){
            skills[i] = new skill();
        }
    }
}