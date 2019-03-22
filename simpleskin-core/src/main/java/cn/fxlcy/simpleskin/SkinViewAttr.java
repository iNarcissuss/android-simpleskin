package cn.fxlcy.simpleskin;

import android.view.View;

/**
 * view上的控制皮肤显示效果的属性
 */
final class SkinViewAttr {
    /**
     * background,textColor,textSize等
     */
    final String attrName;
    final int value;
    private SkinApplicator applicator;

    final int attrId;

    SkinViewAttr(int attrId, String attrName, int value, SkinApplicator applicator) {
        this.attrId = attrId;
        this.attrName = attrName;
        this.value = value;
        this.applicator = applicator;
    }



    @SuppressWarnings("unchecked")
    public void apply(View view) {
        if(applicator != null) {
            applicator.apply(view, attrName, value);
        }
    }
}
