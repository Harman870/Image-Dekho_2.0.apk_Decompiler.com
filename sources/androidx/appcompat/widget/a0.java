package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public TextView f689a;

    /* renamed from: b  reason: collision with root package name */
    public TextClassifier f690b;

    public static final class a {
        public static TextClassifier a(TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
        }
    }

    public a0(TextView textView) {
        textView.getClass();
        this.f689a = textView;
    }
}
