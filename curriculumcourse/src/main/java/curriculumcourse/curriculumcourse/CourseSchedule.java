/**
 * Copyright 2017 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package curriculumcourse.curriculumcourse;

import org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore;
import org.optaplanner.core.impl.domain.solution.AbstractSolution;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.optaplanner.core.api.domain.solution.PlanningSolution
public class CourseSchedule extends AbstractSolution<HardSoftScore>
        implements
        java.io.Serializable {

    static final long serialVersionUID = 1L;

    private java.util.List<Teacher> teacherList;
    private java.util.List<Curriculum> curriculumList;
    private java.util.List<Day> dayList;
    private java.util.List<Timeslot> timeslotList;
    @org.optaplanner.core.api.domain.valuerange.ValueRangeProvider(id = "periodRange")
    private java.util.List<Period> periodList;
    @org.optaplanner.core.api.domain.valuerange.ValueRangeProvider(id = "roomRange")
    private java.util.List<Room> roomList;
    @org.optaplanner.core.api.domain.solution.PlanningEntityCollectionProperty
    private java.util.List<Lecture> lectureList;

    private java.lang.Long id;

    private java.lang.String name;

    private java.util.List<Course> courseList;

    public CourseSchedule() {
    }

    public java.util.List<Teacher> getTeacherList() {
        return this.teacherList;
    }

    public void setTeacherList(java.util.List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    public java.util.List<Curriculum> getCurriculumList() {
        return this.curriculumList;
    }

    public void setCurriculumList(java.util.List<Curriculum> curriculumList) {
        this.curriculumList = curriculumList;
    }

    public java.util.List<Day> getDayList() {
        return this.dayList;
    }

    public void setDayList(java.util.List<Day> dayList) {
        this.dayList = dayList;
    }

    public java.util.List<Timeslot> getTimeslotList() {
        return this.timeslotList;
    }

    public void setTimeslotList(java.util.List<Timeslot> timeslotList) {
        this.timeslotList = timeslotList;
    }

    public java.util.List<Period> getPeriodList() {
        return this.periodList;
    }

    public void setPeriodList(java.util.List<Period> periodList) {
        this.periodList = periodList;
    }

    public java.util.List<Room> getRoomList() {
        return this.roomList;
    }

    public void setRoomList(java.util.List<Room> roomList) {
        this.roomList = roomList;
    }

    public java.util.List<Lecture> getLectureList() {
        return this.lectureList;
    }

    public void setLectureList(java.util.List<Lecture> lectureList) {
        this.lectureList = lectureList;
    }

    public java.lang.Long getId() {
        return this.id;
    }

    public void setId(java.lang.Long id) {
        this.id = id;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public java.util.List<Course> getCourseList() {
        return this.courseList;
    }

    public void setCourseList(java.util.List<Course> courseList) {
        this.courseList = courseList;
    }

    public CourseSchedule(
            java.util.List<curriculumcourse.curriculumcourse.Teacher> teacherList,
            java.util.List<curriculumcourse.curriculumcourse.Curriculum> curriculumList,
            java.util.List<curriculumcourse.curriculumcourse.Day> dayList,
            java.util.List<curriculumcourse.curriculumcourse.Timeslot> timeslotList,
            java.util.List<curriculumcourse.curriculumcourse.Period> periodList,
            java.util.List<curriculumcourse.curriculumcourse.Room> roomList,
            java.util.List<curriculumcourse.curriculumcourse.Lecture> lectureList,
            java.lang.Long id,
            java.lang.String name,
            java.util.List<curriculumcourse.curriculumcourse.Course> courseList) {
        this.teacherList = teacherList;
        this.curriculumList = curriculumList;
        this.dayList = dayList;
        this.timeslotList = timeslotList;
        this.periodList = periodList;
        this.roomList = roomList;
        this.lectureList = lectureList;
        this.id = id;
        this.name = name;
        this.courseList = courseList;
    }
}