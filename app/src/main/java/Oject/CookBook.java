package Oject;

import org.json.JSONException;
import org.json.JSONObject;

public class CookBook {
        private String tenMonAn,CapDo,LinkAnh;


        public CookBook () {

        }

    public CookBook (JSONObject o) throws JSONException {
        tenMonAn = o.getString("tenMonAn");
        CapDo = o.getString("CapDo");
        LinkAnh = o.getString("linkAnh");
    }
        public CookBook(String tenMonAn, String CapDo, String linkAnh) {
            this.tenMonAn = tenMonAn;
            this.CapDo= CapDo;
            LinkAnh = linkAnh;
        }

        public String getTenMonAn() {
            return tenMonAn;
        }

        public void setTenMonAn(String tenMonAn) {
            this.tenMonAn = tenMonAn;
        }

        public String getCapDo() {
            return CapDo;
        }

        public void setCapDo(String CapDo) {
            this.CapDo = CapDo;
        }

        public String getLinkAnh() {
            return LinkAnh;
        }

        public void setLinkAnh(String linkAnh) {
            LinkAnh = linkAnh;
        }
    }


