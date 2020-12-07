import CF_Api.GetCFData;
import CF_Api.Rows;
import com.fasterxml.jackson.databind.ObjectMapper;


import java.io.File;
import java.net.URL;
import java.util.*;


public class Standings {
    public static void main(String[] args) throws Exception {
        System.out.print("Contest id: ");
        Scanner scanner = new Scanner(System.in);
        long contestid = scanner.nextLong();
        scanner.close();

        File file = new File("C:\\Users\\user\\Desktop\\CFHandles.txt");
        Scanner sc = new Scanner(file);
        sc.useDelimiter("\\Z");
        String[] handles = sc.next().split(" |\\n");

        StringBuffer urlString = new StringBuffer("https://codeforces.com/api/contest.standings?showUnofficial=true&contestId=" + contestid + "&handles=");
        for (String handle : handles) urlString.append(handle.strip()).append(";");

        URL url = new URL(urlString.toString());

        ObjectMapper mapper = new ObjectMapper();
        GetCFData data = mapper.readValue(url, GetCFData.class);
        List<Rows> rows = data.getResult().getRows();

        for (Rows row : rows) {
            if (row.getParty().getParticipantType().equals("CONTESTANT"))
                System.out.println(row.getParty().getMembers().get(0).getHandle() + " " + row.getRank());
        }

    }
}
