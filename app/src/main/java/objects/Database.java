package objects;

import java.util.ArrayList;

public class Database {

    private static ArrayList<Video> videoArrayList = new ArrayList<Video>() {
        {
            add(new Video("XU0llRltyFM", "Introduction to Agile Scrum", "8:52", "img1"));
            add(new Video("dtzPtFi8jiQ", "Spotify Engineering Culture with Agile (Part 1/2)", "13:12", "img2"));
            add(new Video("uXL3tNmPkzc", "Spotify Engineering Culture with Agile (Part 2/2)", "13:27", "img3"));
            add(new Video("vLqCkj0PvtE", "Scrum Team", "2:34", "img4"));
            add(new Video("502ILHjX9EE", "Product Owner and Scrum Team", "15:51", "img5"));
        }};

    public static ArrayList<Video> getVideoArrayList() {
        return videoArrayList;
    }

    public static Video getVideoById(String id) {
        for (Video v: videoArrayList) {
            if (v.getId() == id) {
                return v;
            }
        }
        return null;
    }

    private static ArrayList<Definition> definitionArrayList = new ArrayList<Definition>() {
        {
            add(new Definition("Burndown Charts", "shows the amount of work that has been completed in an epic or sprint, and the total work remaining. Burndown charts are used to predict your team's likelihood of completing their work in the time available."));
            add(new Definition("Daily Scrum Meeting", "helps set the context for the coming day's work. Strictly time-boxed to 15 minutes."));
            add(new Definition("Epics", "a body of work that can be broken down into specific tasks (called “stories,” or “user stories”) based on the needs/requests of customers or end users. Epics are a helpful way to organize your work and to create a hierarchy."));
            add(new Definition("Product Backlog", "an ordered list of everything that is known to be needed in the product. It is the single source of requirements for any changes to be made to the product. The Product Owner is responsible for the Product Backlog, including its content, availability, and ordering."));
            add(new Definition("Product Owner", "project’s key stakeholder; responsible for maximizing the value of the product resulting from the work of the Scrum Team."));
            add(new Definition("Scrum", "an agile process that allows us to focus on delivering the highest business value in the shortest time."));
            add(new Definition("Scrum Team", "a collection of individuals working together to deliver the requested and committed product increments."));
            add(new Definition("Scrum Master", "facilitator for the agile development team; manages the process for how information is exchanged; helps the team enhance and streamline the processes by which they achieve their goals. "));
            add(new Definition("Sprint", "a set period of time during which specific work has to be completed and made ready for review."));
            add(new Definition("Sprint Backlog", "set of Product Backlog items selected for the Sprint, plus a plan for delivering the product Increment and realizing the Sprint Goal. The Sprint Backlog is a forecast by the Team about what functionality will be in the next Increment and the work needed to deliver that functionality into a “Done” Increment."));
            add(new Definition("Sprint Planning", "a collaborative effort involving a ScrumMaster, who facilitates the meeting, a Product Owner, who clarifies the details of the product backlog items and their respective acceptance criteria, and the Entire Agile Team, who define the work and effort necessary to meet their sprint commitment."));
            add(new Definition("Sprint Retrospective", "an opportunity for the Scrum Team to inspect itself and create a plan for improvements to be enacted during the next Sprint. The Sprint Retrospective occurs after the Sprint Review and prior to the next Sprint Planning."));
            add(new Definition("Sprint Review", "held at the end of the Sprint to inspect the Increment and adapt the Product Backlog if needed. During the Sprint Review, the Scrum Team and stakeholders collaborate about what was done in the Sprint."));
            add(new Definition("User Modelling", "subdivision of human–computer interaction which describes the process of building up and modifying a conceptual understanding of the user. The main goal of user modelling is customization and adaptation of systems to the user's specific needs."));
            add(new Definition("User Story Mapping", "arranges user stories into a useful model to help understand the functionality of the system, identify holes and omissions in your backlog, and effectively plan holistic releases that deliver value to users and business with each release."));
        }};

    public static ArrayList<Definition> getDefinitionArrayList() {
        return definitionArrayList;
    }

    public static Definition getDefinitionByWord(String word) {
        for (Definition d: definitionArrayList) {
            if (d.getWord().equals(word)) {
                return d;
            }
        }
        return null;
    }

    private static ArrayList<Question> questionArrayList = new ArrayList<Question>() {
        {
            add(new Question("Who manages the process for how information is exchanged in a scrum team?", "Product Owner", "Scrum Master", "Scrum Team Members", "Scrum Analyst", "Scrum Master"));
            add(new Question("Which of the following is NOT part of Scrum Ceremonies?", "Sprint Planning", "Sprint Review", "Sprint Backlog", "Daily Scrum Meeting", "Sprint Backlog"));
            add(new Question("What is Sprint Planning?", "Team presents what it accomplished during the sprint.", "Team selects items from the product backlog they can commit to completing.", "Team inspect itself and create a plan for improvements for next Sprint.", "Team plans today and tomorrow’s commitments. ", "Team selects items from the product backlog they can commit to completing."));
            add(new Question("What is the first question to be answered in a daily scrum meeting?", "What will you do today?", "What have you done so far?", "What did you do yesterday?", "Is anything in your way?", "What did you do yesterday?"));
            add(new Question("Which of the following is NOT a characteristic of a Scrum Team?", "Self-Organising", "Cross-Functional", "Contains 5-9 people", "Part-time", "Part-time"));
            add(new Question("What is in a product vision?", "Target Group, Needs, Product, Value", "Value, Vision, Objectives, Product", "Target Group, Needs, Goals, Value", "Target Group, Wants, Product, Value", "Target Group, Needs, Product, Value"));
            add(new Question("When is product backlog reprioritised?", "End of each sprint", "Start of each sprint", "Middle of each sprint", "Does not matter", "Start of each sprint"));
            add(new Question("Which of the following component is NOT part of persona modelling?", "Name & sketch", "Behaviours", "Description", "Value", "Value"));
            add(new Question("What are acceptance criteria for user stories?", "The conditions that a user story must satisfy to be accepted by a user", "The conditions that a user story must match a user’s value", "The conditions that a user story must satisfy to the tasks planned", "The conditions that a user story must match user role and goal", "The conditions that a user story must satisfy to be accepted by a user"));
            add(new Question("How is user story mapping useful?", "Helps the team to understand their users deeply", "Helps users to understand the product", "Helps the teams to develop functions they like", "Helps build empathy with user, visually depicting the journey undertaken", "Helps build empathy with user, visually depicting the journey undertaken"));

        }};

    public static ArrayList<Question> getQuestionArrayList() {
        return questionArrayList;
    }

    public static Question getQuestionByQuestion(String question) {
        for (Question q: questionArrayList) {
            if (q.getQuestion().equals(question)) {
                return q;
            }
        }
        return null;
    }
}
