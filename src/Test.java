import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Test {
    public static void main(String[] args) {
        String str = "<span><abbr data-title=\"заимствование из персидского языка\">перс.</abbr></span>\n" +
                "<br /><span>1) <a href=\"/ru/dictionary/translate/ru/kk/удалец/\" data-lang-from=\"ru\" data-lang-to=\"kk\">удалец</a>; <a href=\"/ru/dictionary/translate/ru/kk/молодец/\" data-lang-from=\"ru\" data-lang-to=\"kk\">молодец</a> <em>(употребляется для выражения восхищения)</em></span>\n" +
                "<br /><span>жігіт-ақ екен, сабаз! → настоящий джигит, молодец!</span>\n" +
                "<br /><span>2) <a href=\"/ru/dictionary/translate/ru/kk/храбрец/\" data-lang-from=\"ru\" data-lang-to=\"kk\">храбрец</a>; <a href=\"/ru/dictionary/translate/ru/kk/герой/\" data-lang-from=\"ru\" data-lang-to=\"kk\">герой</a> <em>(употребляется в ироническом значении, когда поведение другого человека не нравится)</em></span>\n" +
                "<br /><span>ой, сабазым! → тоже мне храбрец!</span>";


        String result = str.replaceAll("<(.|\r|\n|\f)*?>", "");

        //System.out.println("result = " + result);

        StringTokenizer stringTokenizer = new StringTokenizer(result, "\n");

        List<String> resultList = new ArrayList<>();
String  fff = null;
        int i = 1;
        while (stringTokenizer.hasMoreTokens()) {
            fff.toString();
            if (i % 2 == 0) {
                String s = stringTokenizer.nextToken();
                resultList.add(s);
            } else {
                stringTokenizer.nextToken();
            }
            i++;
        }


        for (String s : resultList) {
            s = s.replaceAll("\\([^()]*\\)", "");
            System.out.println("s = " + s);
        }

    }

}
