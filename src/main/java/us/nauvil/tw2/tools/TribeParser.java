package us.nauvil.tw2.tools;


import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.sym.Name;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

public class TribeParser {

    private static final Logger log = LogManager.getLogger(TribeParser.class);

    public void TribeParser() {
    }


    public void parse(String json) throws IOException {

        JsonFactory f = new JsonFactory();
        JsonParser jp = f.createParser(json);

        jp.nextToken();
        while (jp.nextToken() == JsonToken.FIELD_NAME) {

            jp.nextToken();
            String fieldname = jp.getCurrentName();
            log.debug("fieldname: {}", fieldname);

            switch(fieldname)
            {
                case "draw":

                    break;

                case "recordsTotal":

                    break;

                case "recordsFiltered":

                    break;

                case "data" :
                    if(jp.nextToken() != JsonToken.START_ARRAY) {
                        throw new IllegalStateException("Expected an array");
                    }

                    while(jp.nextToken() != JsonToken.END_ARRAY) {

                        log.debug(jp.getValueAsString());

                        jp.nextToken();
                    }

                    break;
            }

            if ("draw".equals(fieldname)) {
            }

                if ("name".equals(fieldname)) { // contains an object

/*
                    while (jp.nextToken() != JsonToken.END_OBJECT) {
                        String namefield = jp.getCurrentName();
                        jp.nextToken(); // move to value
                        if ("draw".equals(namefield)) {
                            name.setFirst(jp.getText());
                        } else if ("recordsTotal".equals(namefield)) {
                            name.setLast(jp.getText());
                        } else {
                            throw new IllegalStateException("Unrecognized field '" + fieldname + "'!");
                        }
                    }
                    user.setName(name);

                    */
                }
                /*else if ("gender".equals(fieldname)) {
                    user.setGender(User.Gender.valueOf(jp.getText()));
                } else if ("verified".equals(fieldname)) {
                    user.setVerified(jp.getCurrentToken() == JsonToken.VALUE_TRUE);
                } else if ("userImage".equals(fieldname)) {
                    user.setUserImage(jp.getBinaryValue());
                } else {
                    throw new IllegalStateException("Unrecognized field '" + fieldname + "'!");
                }
                */
            }
            jp.close(); // ensure resources get cleaned up timely and properly

        }

    }
