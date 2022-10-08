package org.matsim.analysis;

import org.matsim.core.api.experimental.events.EventsManager;
import org.matsim.core.events.EventsUtils;

public class SimpleAnalysis {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        SimplePersonEventHandler handler = new SimplePersonEventHandler();
        EventsManager manager = EventsUtils.createEventsManager();
        manager.addHandler(handler);

        EventsUtils.readEvents(manager, "D:\\Module\\Matsim\\matsim-serengeti-park-hodenhagen\\scenarios\\serengeti-park-v1.0\\output\\output-serengeti-park-v1.0-run1\\serengeti-park-v1.0-run1.output_events.xml.gz");

    }
}
