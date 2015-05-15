package com.example.caseuploadactivity;


import com.esri.android.map.MapView;
import com.esri.android.map.ags.ArcGISTiledMapServiceLayer;
import com.esri.android.runtime.ArcGISRuntime;
import com.esri.core.geometry.Point;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SJFragment extends Fragment {

	// create ArcGIS objects
	MapView mMapView = null;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		return inflater.inflate(R.layout.fragment_caseupload, container, false);
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);

		// È¥³ýË®Ó¡
		ArcGISRuntime.setClientId("1eFHW78avlnRUPHm");

		initView();

	}

	private void initView() {
		// Retrieve the map and initial extent from XML layout.
		mMapView = (MapView) getActivity().findViewById(R.id.map);

		ArcGISTiledMapServiceLayer layer = new ArcGISTiledMapServiceLayer(
				"http://60.14.32.39:6080/arcgis/rest/services/NEHE_CGGDT_20140920_0120_84/MapServer"); 
		mMapView.addLayer(layer);

		Point centerPoint = new Point(124.87439595829876, 48.4789018914509);

		mMapView.centerAt(centerPoint, true);

	}

}
