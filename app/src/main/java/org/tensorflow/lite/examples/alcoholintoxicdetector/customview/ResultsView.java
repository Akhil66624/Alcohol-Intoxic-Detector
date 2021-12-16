package org.tensorflow.lite.examples.alcoholintoxicdetector.customview;

import org.tensorflow.lite.examples.alcoholintoxicdetector.tflite.Classifier;

import java.util.List;

public interface ResultsView {
    public void setResults(final List<Classifier.Recognition> results) ;
}
