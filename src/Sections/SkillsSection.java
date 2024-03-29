package Sections;

import Sections.SubSections.Skill;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class SkillsSection extends Section {

    private List<Skill> mySkills;

    public SkillsSection() {
        this.sectionType = SectionType.SKILLS;
        this.mySkills = new ArrayList<>();
    }

    public void addSkill(Skill skill) {
        mySkills.add(skill);
    }

    @Override
    public String toString() {
        String skills = "Skills\n";
        for (Skill skill : mySkills) {
            skills = skills.concat(skill.toString()+"\n");
        }
        return skills;
    }
}
