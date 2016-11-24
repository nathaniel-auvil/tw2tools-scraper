package us.nauvil.tw2.tools;


import org.junit.Test;

import java.io.IOException;

public class TribeParserTest {


    @Test
    public void parse() throws IOException {

        String json = "{\"draw\":1,\"recordsTotal\":\"240\",\"recordsFiltered\":\"240\",\"data\":[[\"1\",\"<a href='http:\\/\\/www.tw2-tools.com\\/us18\\/tribe\\/6\\/'>xVx<\\/a>\",\"<a href='http:\\/\\/www.tw2-tools.com\\/us18\\/tribe\\/6\\/'>The Valiant Uprising<\\/a>\",\"175\",\"729\",\"2 098 388\",\"11 991\",\"2 878\"],[\"2\",\"<a href='http:\\/\\/www.tw2-tools.com\\/us18\\/tribe\\/46\\/'>Hi.<\\/a>\",\"<a href='http:\\/\\/www.tw2-tools.com\\/us18\\/tribe\\/46\\/'>Hostile Intentions<\\/a>\",\"161\",\"513\",\"1 140 920\",\"7 086\",\"2 224\"],[\"3\",\"<a href='http:\\/\\/www.tw2-tools.com\\/us18\\/tribe\\/2\\/'>COS<\\/a>\",\"<a href='http:\\/\\/www.tw2-tools.com\\/us18\\/tribe\\/2\\/'>Covenant of the Sword<\\/a>\",\"68\",\"332\",\"950 474\",\"13 978\",\"2 863\"],[\"4\",\"<a href='http:\\/\\/www.tw2-tools.com\\/us18\\/tribe\\/90\\/'>GoH<\\/a>\",\"<a href='http:\\/\\/www.tw2-tools.com\\/us18\\/tribe\\/90\\/'>Guardians of Honor<\\/a>\",\"127\",\"327\",\"670 608\",\"5 280\",\"2 051\"],[\"5\",\"<a href='http:\\/\\/www.tw2-tools.com\\/us18\\/tribe\\/42\\/'>TNM<\\/a>\",\"<a href='http:\\/\\/www.tw2-tools.com\\/us18\\/tribe\\/42\\/'>The NorthMen<\\/a>\",\"188\",\"409\",\"655 272\",\"3 485\",\"1 602\"],[\"6\",\"<a href='http:\\/\\/www.tw2-tools.com\\/us18\\/tribe\\/350\\/'>DEP<\\/a>\",\"<a href='http:\\/\\/www.tw2-tools.com\\/us18\\/tribe\\/350\\/'>THE DEPLORABLES<\\/a>\",\"154\",\"261\",\"159 794\",\"1 038\",\"612\"],[\"7\",\"<a href='http:\\/\\/www.tw2-tools.com\\/us18\\/tribe\\/119\\/'>TN2<\\/a>\",\"<a href='http:\\/\\/www.tw2-tools.com\\/us18\\/tribe\\/119\\/'>TheNorthMen2<\\/a>\",\"41\",\"87\",\"150 463\",\"3 670\",\"1 729\"],[\"8\",\"<a href='http:\\/\\/www.tw2-tools.com\\/us18\\/tribe\\/166\\/'>IRN<\\/a>\",\"<a href='http:\\/\\/www.tw2-tools.com\\/us18\\/tribe\\/166\\/'>Iron Legion<\\/a>\",\"39\",\"84\",\"126 040\",\"3 232\",\"1 500\"],[\"9\",\"<a href='http:\\/\\/www.tw2-tools.com\\/us18\\/tribe\\/72\\/'>H&L<\\/a>\",\"<a href='http:\\/\\/www.tw2-tools.com\\/us18\\/tribe\\/72\\/'>Elite Assassians<\\/a>\",\"40\",\"82\",\"123 243\",\"3 081\",\"1 503\"],[\"10\",\"<a href='http:\\/\\/www.tw2-tools.com\\/us18\\/tribe\\/239\\/'>TBS<\\/a>\",\"<a href='http:\\/\\/www.tw2-tools.com\\/us18\\/tribe\\/239\\/'>THE BRUTE SQUAD<\\/a>\",\"26\",\"60\",\"94 710\",\"3 643\",\"1 579\"]]}";

        TribeParser t = new TribeParser();
        t.parse(json);

    }


}
