package lesson9.task1;

import java.util.Comparator;

/**
 * Created by Артём on 05.03.2017.
 */

    public class ByMark implements Comparator<Student> {
        @Override
        public int compare(Student firstStudent, Student secondStudent) {
            return new Integer(firstStudent.getMark()).compareTo(secondStudent.getMark());
        }
    }
