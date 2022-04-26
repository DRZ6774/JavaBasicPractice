package interviewQuestions8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class Q04_MapTask {

    // PART 1
    // create a map with groupName as key and groupMembers as value
    // "Group1" = ["Member1", "Member2"]
    // "Group2" = ["Member3", "Member4", "Member5"]
    // BÖLÜM 1
    // anahtar olarak groupName ve değer olarak groupMembers ile bir harita oluşturun
    // "Grup1" = ["Üye1", "Üye2"]
    // "Grup2" = ["Üye3", "Üye4", "Üye5"]
    // create a map with groupName as key and groupMembers as value
    // PART 2
    // find how many members each group has
    // BÖLÜM 2
    // her grubun kaç üyesi olduğunu bul

    public static void main(String[] args) {

        HashMap<String , ArrayList<String >>grupIsimVeuyeler=new HashMap<>();

        ArrayList<String>devTeam=new ArrayList<>(Arrays.asList("Abdullah","Kutay","Enes Faruk","Yasin"));
        ArrayList<String>qaTeam=new ArrayList<>(Arrays.asList("Kadir","Seher","Gokhan","Bahattin"));

        grupIsimVeuyeler.put("Dev ", devTeam);
        grupIsimVeuyeler.put("QA ",qaTeam);

        System.out.println(grupIsimVeuyeler);
        //{QA=[Kadir, Seher, Gokhan, Bahattin], Dev =[Abdullah, Kutay, Enes Faruk, Yasin]}

        //2.yol

        Set<String >keys=grupIsimVeuyeler.keySet();
        for (String key : keys
             ) {
            ArrayList<String>grupList=grupIsimVeuyeler.get(key);
            System.out.println("Gruptaki uye sayısı : "+key + grupList.size());
        }


    }
}
