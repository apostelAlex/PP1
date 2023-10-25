public class TestData {

    public static Teilnehmer[] getTeilnehmerFeld() {
        Teilnehmer[] teilnehmer = new Teilnehmer[teilnehmerData.length];
        int i = 0;
        for (String[] tData : teilnehmerData) {
            teilnehmer[i++] =
                new Teilnehmer(tData[0], toInt(tData[1]), toInt(tData[2]));
        }
        return teilnehmer;
    }

    /* wandelt einen String in ein int um (falls moeglich) */
    public static int toInt(String s) {
        return Integer.parseInt(s);
    }

    public static String[][] teilnehmerData = {
        {"Lea Braun","1244","2012"},
        {"Jonas Zimmermann","609","2017"},
        {"Paul Mueller","956","2014"},
        {"David Braun","691","2014"},
        {"Maria Wolf","1932","2010"},
        {"David Krueger","1776","2018"},
        {"Lukas Hoffmann","647","2013"},
        {"Paul Richter","1170","2013"},
        {"Mia Wolf","942","2015"},
        {"Lea Schmidt","1648","2018"},
        {"Marie Hoffmann","705","2011"},
        {"Mia Schaefer","1074","2014"},
        {"Lea Mueller","1438","2018"},
        {"Laura Wagner","730","2017"},
        {"Sophie Bauer","944","2010"},
        {"Sophie Wolf","1742","2012"},
        {"Paul Wagner","1693","2010"},
        {"Marie Schmidt","1387","2018"},
        {"Hanna Schneider","1846","2010"},
        {"Felix Hartmann","1407","2013"},
        {"Alexander Neumann","751","2010"},
        {"Laura Schmidt","1875","2015"},
        {"Paul Fischer","1641","2016"},
        {"Elias Hoffmann","992","2017"},
        {"Paul Schaefer","607","2019"},
        {"Luca Bauer","2092","2013"},
        {"Sophie Mueller","795","2013"},
        {"Marie Zimmermann","1008","2014"},
        {"Alexander Richter","1189","2016"},
        {"Laura Schwarz","807","2010"},
        {"Mia Koch","1157","2013"},
        {"Sophie Schwarz","802","2019"},
        {"Felix Koch","869","2011"},
        {"Hanna Becker","1610","2016"},
        {"Maximilian Bauer","2028","2011"},
        {"Hanna Zimmermann","898","2016"},
        {"Maximilian Hofmann","1763","2010"},
        {"Luca Schulz","1342","2010"},
        {"Elias Wagner","1381","2017"},
        {"Laura Bauer","1696","2010"},
        {"Laura Wolf","1069","2013"},
        {"Alexander Klein","742","2014"},
        {"Marie Fischer","1502","2018"},
        {"Maria Krueger","765","2011"},
        {"Luca Krueger","690","2015"},
        {"Emma Becker","2077","2017"},
        {"Emma Klein","1784","2017"},
        {"Alexander Hofmann","1488","2017"},
        {"Luca Mueller","1398","2019"},
        {"Paul Richter","1990","2017"}
    };
}
