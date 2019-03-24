package Java_Home_Tasks_Lesson_03_Shop.Client.Costumer;

public class Costumer {
        private String email;
        private String clientName;

        public Costumer(String email, String clientName) {
            this.email = email;
            this.clientName = clientName;
        }

        public String getEmail() {
            return email;
        }

        public String getClientName() {
            return clientName;
        }

        @Override
        public boolean equals(Object anotherObject) {
            if (this == anotherObject) return true;
            if (anotherObject == null || getClass() != anotherObject.getClass()) return false;

            Costumer client = (Costumer) anotherObject;


            return email.equals(client.email);
        }

        @Override
        public int hashCode() {
            return email.hashCode();
        }

        @Override
        public String toString() {
            final StringBuffer sb = new StringBuffer("Costumer{");
            sb.append("email='").append(email).append('\'');
            sb.append(", clientName='").append(clientName).append('\'');
            sb.append('}');
            return sb.toString();
        }
    }
