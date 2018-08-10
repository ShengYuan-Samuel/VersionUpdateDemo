package com.nistart.versionupdatedemo.bean;

/**
 * @author Samuel
 * @time 2018/8/10 11:51
 * @describe
 */
public class Version {

    /**
     * code : 200
     * message : null
     * data : {"effective":1,"software":{"id":1,"content":"1：添加抽奖功能；\r\n2：修复已知BUG；","versionDesc":"1.5.1","osType":1,"version":7,"updateUrl":"https://www.ninstarscf.com/","createTime":"2018-07-17T08:07:58.000+0000","status":1},"update":1,"interval":30,"key":"20005db2e1d3248f","taskId":1}
     */

    private int code;
    private Object message;
    private DataBean data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * effective : 1
         * software : {"id":1,"content":"1：添加抽奖功能；\r\n2：修复已知BUG；","versionDesc":"1.5.1","osType":1,"version":7,"updateUrl":"https://www.ninstarscf.com/","createTime":"2018-07-17T08:07:58.000+0000","status":1}
         * update : 1
         * interval : 30
         * key : 20005db2e1d3248f
         * taskId : 1
         */

        private int effective;
        private SoftwareBean software;
        private int update;
        private int interval;
        private String key;
        private int taskId;

        public int getEffective() {
            return effective;
        }

        public void setEffective(int effective) {
            this.effective = effective;
        }

        public SoftwareBean getSoftware() {
            return software;
        }

        public void setSoftware(SoftwareBean software) {
            this.software = software;
        }

        public int getUpdate() {
            return update;
        }

        public void setUpdate(int update) {
            this.update = update;
        }

        public int getInterval() {
            return interval;
        }

        public void setInterval(int interval) {
            this.interval = interval;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public int getTaskId() {
            return taskId;
        }

        public void setTaskId(int taskId) {
            this.taskId = taskId;
        }

        public static class SoftwareBean {
            /**
             * id : 1
             * content : 1：添加抽奖功能；
             2：修复已知BUG；
             * versionDesc : 1.5.1
             * osType : 1
             * version : 7
             * updateUrl : https://www.ninstarscf.com/
             * createTime : 2018-07-17T08:07:58.000+0000
             * status : 1
             */

            private int id;
            private String content;
            private String versionDesc;
            private int osType;
            private int version;
            private String updateUrl;
            private String createTime;
            private int status;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public String getVersionDesc() {
                return versionDesc;
            }

            public void setVersionDesc(String versionDesc) {
                this.versionDesc = versionDesc;
            }

            public int getOsType() {
                return osType;
            }

            public void setOsType(int osType) {
                this.osType = osType;
            }

            public int getVersion() {
                return version;
            }

            public void setVersion(int version) {
                this.version = version;
            }

            public String getUpdateUrl() {
                return updateUrl;
            }

            public void setUpdateUrl(String updateUrl) {
                this.updateUrl = updateUrl;
            }

            public String getCreateTime() {
                return createTime;
            }

            public void setCreateTime(String createTime) {
                this.createTime = createTime;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }
        }
    }
}
