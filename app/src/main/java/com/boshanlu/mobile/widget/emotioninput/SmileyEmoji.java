package com.boshanlu.mobile.widget.emotioninput;


import android.util.Pair;

import java.util.ArrayList;
import java.util.List;


/**
 * emoji睿思不支持
 */
public class SmileyEmoji {

    public static final String[] DATA = new String[]{
            newString(0x1f604),
            newString(0x1f603),
            newString(0x1f600),
            newString(0x1f60a),
            Character.toString((char) 0x263a),
            newString(0x1f609),
            newString(0x1f60d),
            newString(0x1f618),
            newString(0x1f61a),
            newString(0x1f617),
            newString(0x1f619),
            newString(0x1f61c),
            newString(0x1f61d),
            newString(0x1f61b),
            newString(0x1f633),
            newString(0x1f601),
            newString(0x1f614),
            newString(0x1f60c),
            newString(0x1f612),
            newString(0x1f61e),
            newString(0x1f623),
            newString(0x1f622),
            newString(0x1f602),
            newString(0x1f62d),
            newString(0x1f62a),
            newString(0x1f625),
            newString(0x1f630),
            newString(0x1f605),
            newString(0x1f613),
            newString(0x1f629),
            newString(0x1f62b),
            newString(0x1f628),
            newString(0x1f631),
            newString(0x1f620),
            newString(0x1f621),
            newString(0x1f624),
            newString(0x1f616),
            newString(0x1f606),
            newString(0x1f60b),
            newString(0x1f637),
            newString(0x1f60e),
            newString(0x1f634),
            newString(0x1f635),
            newString(0x1f632),
            newString(0x1f61f),
            newString(0x1f626),
            newString(0x1f627),
            newString(0x1f608),
            newString(0x1f47f),
            newString(0x1f62e),
            newString(0x1f62c),
            newString(0x1f610),
            newString(0x1f615),
            newString(0x1f62f),
            newString(0x1f636),
            newString(0x1f607),
            newString(0x1f60f),
            newString(0x1f611),
            newString(0x1f472),
            newString(0x1f473),
            newString(0x1f46e),
            newString(0x1f477),
            newString(0x1f482),
            newString(0x1f476),
            newString(0x1f466),
            newString(0x1f467),
            newString(0x1f468),
            newString(0x1f469),
            newString(0x1f474),
            newString(0x1f475),
            newString(0x1f471),
            newString(0x1f47c),
            newString(0x1f478),
            newString(0x1f63a),
            newString(0x1f638),
            newString(0x1f63b),
            newString(0x1f63d),
            newString(0x1f63c),
            newString(0x1f640),
            newString(0x1f63f),
            newString(0x1f639),
            newString(0x1f63e),
            newString(0x1f479),
            newString(0x1f47a),
            newString(0x1f648),
            newString(0x1f649),
            newString(0x1f64a),
            newString(0x1f480),
            newString(0x1f47d),
            newString(0x1f4a9),
            newString(0x1f525),
            Character.toString((char) 0x2728),
            newString(0x1f31f),
            newString(0x1f4ab),
            newString(0x1f4a5),
            newString(0x1f4a2),
            newString(0x1f4a6),
            newString(0x1f4a7),
            newString(0x1f4a4),
            newString(0x1f4a8),
            newString(0x1f442),
            newString(0x1f440),
            newString(0x1f443),
            newString(0x1f445),
            newString(0x1f444),
            newString(0x1f44d),
            newString(0x1f44e),
            newString(0x1f44c),
            newString(0x1f44a),
            Character.toString((char) 0x270a),
            Character.toString((char) 0x270c),
            newString(0x1f44b),
            Character.toString((char) 0x270b),
            newString(0x1f450),
            newString(0x1f446),
            newString(0x1f447),
            newString(0x1f449),
            newString(0x1f448),
            newString(0x1f64c),
            newString(0x1f64f),
            Character.toString((char) 0x261d),
            newString(0x1f44f),
            newString(0x1f4aa),
            newString(0x1f6b6),
            newString(0x1f3c3),
            newString(0x1f483),
            newString(0x1f46b),
            newString(0x1f46a),
            newString(0x1f46c),
            newString(0x1f46d),
            newString(0x1f48f),
            newString(0x1f491),
            newString(0x1f46f),
            newString(0x1f646),
            newString(0x1f645),
            newString(0x1f481),
            newString(0x1f64b),
            newString(0x1f486),
            newString(0x1f487),
            newString(0x1f485),
            newString(0x1f470),
            newString(0x1f64e),
            newString(0x1f64d),
            newString(0x1f647),
            newString(0x1f3a9),
            newString(0x1f451),
            newString(0x1f452),
            newString(0x1f45f),
            newString(0x1f45e),
            newString(0x1f461),
            newString(0x1f460),
            newString(0x1f462),
            newString(0x1f455),
            newString(0x1f454),
            newString(0x1f45a),
            newString(0x1f457),
            newString(0x1f3bd),
            newString(0x1f456),
            newString(0x1f458),
            newString(0x1f459),
            newString(0x1f4bc),
            newString(0x1f45c),
            newString(0x1f45d),
            newString(0x1f45b),
            newString(0x1f453),
            newString(0x1f380),
            newString(0x1f302),
            newString(0x1f484),
            newString(0x1f49b),
            newString(0x1f499),
            newString(0x1f49c),
            newString(0x1f49a),
            Character.toString((char) 0x2764),
            newString(0x1f494),
            newString(0x1f497),
            newString(0x1f493),
            newString(0x1f495),
            newString(0x1f496),
            newString(0x1f49e),
            newString(0x1f498),
            newString(0x1f48c),
            newString(0x1f48b),
            newString(0x1f48d),
            newString(0x1f48e),
            newString(0x1f464),
            newString(0x1f465),
            newString(0x1f4ac),
            newString(0x1f463),
            newString(0x1f4ad),
    };

    public static final String newString(int codePoint) {
        if (Character.charCount(codePoint) == 1) {
            return String.valueOf(codePoint);
        } else {
            return new String(Character.toChars(codePoint));
        }
    }

    public static SmileyDataSet getEmojis() {
        SmileyDataSet set = new SmileyDataSet("emoji", SmileyDataSet.TYPE_EMOJI);
        List<Pair<String, String>> smileys = new ArrayList<>();
        for (String a : DATA) {
            smileys.add(new Pair<>(a, a));
        }
        //set.textSize = 22;
        set.setSmileys(smileys);

        return set;
    }
}
