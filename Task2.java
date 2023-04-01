package org.example;

import java.util.Date;
import java.util.Date;
import java.util.Objects;

public class Task2 {
        private String firstName;
        private String lastName;
        private String patronymic;
        private Long telephone;
        private Date date;
        private Character sex;

        public Task2(String firstName, String lastName, String patronymic, Long telephone, Date date, Character sex) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.patronymic = patronymic;
            this.telephone = telephone;
            this.date = date;
            this.sex = sex;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getPatronymic() {
            return patronymic;
        }

        public void setPatronymic(String patronymic) {
            this.patronymic = patronymic;
        }

        public Long getTelephone() {
            return telephone;
        }

        public void setTelephone(Long telephone) {
            this.telephone = telephone;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public Character getSex() {
            return sex;
        }

        public void setSex(Character sex) {
            this.sex = sex;
        }

        @Override
        public String toString() {
            return "Planner{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", patronymic='" + patronymic + '\'' +
                    ", telephone=" + telephone +
                    ", date=" + date +
                    ", sex=" + sex +
                    '}';
        }
    }

}
