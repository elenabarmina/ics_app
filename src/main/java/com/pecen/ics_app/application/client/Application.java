package com.pecen.ics_app.application.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.http.client.*;
import com.google.gwt.user.client.ui.*;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.DOM;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.ClickEvent;

/**
 * Entry point classes define <code>onModuleLoad()</code>
 */
public class Application implements EntryPoint {

    /**
     * This is the entry point method.
     */
    public void onModuleLoad() {
        final Button button = new Button("Click me");

        button.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
                RequestBuilder builder = new RequestBuilder(RequestBuilder.GET, "/get_clients");
                try {
                    Request request = builder.sendRequest(null, new RequestCallback() {
                        public void onError(Request request, Throwable exception) {
                            Label label = new Label("error");
                            RootPanel.get("form_list_client").add(label);
                        }

                        public void onResponseReceived(Request request, Response response) {
                            if (200 == response.getStatusCode()) {
                                Label label = new Label(response.getText());
                                RootPanel.get("form_list_client").add(label);
                            } else {
                                Label label = new Label(response.getStatusText());
                                RootPanel.get("form_list_client").add(label);
                            }
                        }
                    });
                } catch (RequestException e) {
                    Label label = new Label("error");
                    RootPanel.get("form_list_client").add(label);

                }
            }
        });

        RootPanel.get("main").add(button);
    }
}
