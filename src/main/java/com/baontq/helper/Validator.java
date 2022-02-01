package com.baontq.helper;

import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JTextField;

/**
 *
 * @author MSI
 */
public class Validator {

    public static boolean checkEmpty(JTextField field, StringBuilder sb, String msg) {
        if (field.getText().equals("")) {
            sb.append(msg).append("\n");
            field.setBackground(Color.red);
            return false;
        } else {
            field.setBackground(Color.white);
        }
        return true;
    }

    public static boolean checkEmail(JTextField field, StringBuilder sb) {
        if (!checkEmpty(field, sb, "Email đang để trống !")) {
            return false;
        }

        Pattern pattern = Pattern.compile("\\w+@\\w+\\.\\w+");

        Matcher matcher = pattern.matcher(field.getText());

        if (!matcher.find()) {
            sb.append("Email không hợp lệ !\n");
            field.setBackground(Color.red);
            return false;
        }
        field.setBackground(Color.white);
        return true;
    }

    public static boolean checkAge(JTextField field, StringBuilder sb) {

        if (!checkEmpty(field, sb, "Tuổi đang để trống !")) {
            return false;
        }

        try {
            int age = Integer.parseInt(field.getText());

            if (age < 18 || age > 55) {
                sb.append("Tuổi phải nằm khoảng 18 - 55\n");
                field.setBackground(Color.yellow);
                return false;
            }
        } catch (Exception e) {
            sb.append("Giá trị tuổi phải là số !\n");
            field.setBackground(Color.red);
            return false;
        }
        field.setBackground(Color.white);
        return true;
    }

    public static boolean checkSalary(JTextField field, StringBuilder sb) {

        if (!checkEmpty(field, sb, "Lương đang để trống !")) {
            return false;
        }

        try {
            double salary = Double.parseDouble(field.getText());

            if (salary < 5000000) {
                sb.append("Lương phải lớn hơn 5 triệu\n");
                field.setBackground(Color.yellow);
                return false;
            }
        } catch (Exception e) {
            sb.append("Giá trị lương phải là số !\n");
            field.setBackground(Color.red);
            return false;
        }
        field.setBackground(Color.white);
        return true;
    }
}
