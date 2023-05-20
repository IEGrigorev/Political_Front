package com.example.grigorev_smsng;

public class Quest {
    private int score = 0;
    private int currentStep = 0;
    private int authorityNation=90;
    private int authorityParty=100;
    private int treasure=800;
    private int massMediaFreedom=100;
    private int authorityArmy=100;
    private int infrastructure=50;
    private int yourSafety=100;
    private int cost=50;
    private int random_num =1;

    private final Question[] questions = new Question[]{
            new Question(
                    "Поздравляем с победой на выборах! Ваши первые действия?",
                    new Question.Answer[]{
                            new Question.Answer("Выпустить обращение к народу", 1, 1, 5, 0, -5,
                                    0, 5, 0, 0, 0),
                            new Question.Answer("Начать реформацию правительства", 1, 1, 0, 10, -5,
                                    0, 0, 0, 0, 0),
                    }
            ),
            new Question(
                    "Некоторое количество домов скоро превысит срок эксплуатации. Нам нужно решать этот вопрос",
                    new Question.Answer[]{
                            new Question.Answer("Выделить деньги на постройку и переселение граждан в новострой", 1, getRandomNum(), 10, 0, -25,
                                    0, 0, 15, 0, 0),
                            new Question.Answer("Выделить деньги только на постройку жил.массивов", 1, getRandomNum(), -2, 0, -15,
                                    0, 0, 15, 0, 0),
                            new Question.Answer("Позже решим этот вопрос", 1, getRandomNum(), -5, 0, 25,
                                    0, 0, 0, 0, 0),
                    }
            ),

            new Question(
                    "У нас в стране есть проблема с бродячими собаками. Как ее решить?",
                    new Question.Answer[]{
                            new Question.Answer("Заняться отстрелом собак", 1, getRandomNum(), -2, 0, -5,
                                    0, 0, 0, 0, 0),
                            new Question.Answer("Заняться отловом собак, обеспечить им необходимю мед помощь", 1, getRandomNum(), 2, 0, 0,
                                    0, 0, 0, 0, 2),
                            new Question.Answer("Позже решим этот вопрос", 1, getRandomNum(), -5, 0, 25,
                                    0, 0, 0, 0, 0),
                    }
            ),

            new Question(
                    "Поступило предложение уменьшить налог на роскошь",
                    new Question.Answer[]{
                            new Question.Answer("Уменьшить налог", 1, getRandomNum(), 2, 8, 0,
                                    0, 0, 0, 0, 5),
                            new Question.Answer("Отказать", 1, getRandomNum(), 0, -8, 0,
                                    0, 0, 0, 0, 0),

                    }
            ),
            new Question(
                    "СМИ сильно влияют на народное мнение. Может стоит ограничить их в высказываниях о властях?",
                    new Question.Answer[]{
                            new Question.Answer("Ввести гос.цензуру", 1, getRandomNum(), -10, 5, -5,
                                    -20, 0, 0, 0, 0),
                            new Question.Answer("Не стоит об этом волноваться", 1, getRandomNum(), 0, 0, 25,
                                    0, 0, 0, 0, 0),
                    }
            ),
            new Question(
                    "Народная петиция о снижении налога на охотническую деятельность набрала много подписей. Рассмотрим?",
                    new Question.Answer[]{
                            new Question.Answer("Уменьшить налог", 1, getRandomNum(), 5, 5, 0,
                                    0, 0, 0, 0, 5),
                            new Question.Answer("Проигнорировать петицию", 1, getRandomNum(), -5, -5, 0,
                                    0, 0, 0, 0, 0),
                    }
            ),

            new Question(
                    "Партия предлагает снизить налог на охотническую деятельность ",
                    new Question.Answer[]{
                            new Question.Answer("Уменьшить налог", 1, getRandomNum(), 5, 10, 0,
                                    0, 0, 0, 0, 5),
                            new Question.Answer("Проигнорировать петицию", 1, getRandomNum(), -5, -10, 0,
                                    0, 0, 0, 0, 0),
                    }
            ),

            new Question(
                    "Партия предлагает увеличить налог на недвижимость и направить деньги на ее обслуживание",
                    new Question.Answer[]{
                            new Question.Answer("Увеличить налог", 1, getRandomNum(), -10, 5, 50,
                                    0, 0, 10, 0, -10),
                            new Question.Answer("Отказать", 1, getRandomNum(), 5, -5, 0,
                                    0, 0, 0, 0, 0),
                    }
            ),

            new Question(
                    "Народ, через петицию, предлагает уменьшить налог на недвижимость",
                    new Question.Answer[]{
                            new Question.Answer("Уменьшить налог", 1, getRandomNum(), 10, -1, 0,
                                    0, 0, 0, 0, 10),
                            new Question.Answer("Отказать", 1, getRandomNum(), -5, 5, 0,
                                    0, 0, 0, 0, 0),
                    }
            ),

            new Question(
                    "Партия предлагает увеличить налог на ТС",
                    new Question.Answer[]{
                            new Question.Answer("Увеличить налог", 1, getRandomNum(), -10, 5, 30,
                                    0, 0, 0, 0, -10),
                            new Question.Answer("Отказать", 1, getRandomNum(), 5, -5, 0,
                                    0, 0, 0, 0, 0),
                    }
            ),

            new Question(
                    "Народ, через петицию, предлагает уменьшить налог на ТС",
                    new Question.Answer[]{
                            new Question.Answer("Уменьшить налог", 1, getRandomNum(), 5, -1, 0,
                                    0, 0, 0, 0, 5),
                            new Question.Answer("Отказать", 1, getRandomNum(), -5, 5, 0,
                                    0, 0, 0, 0, 0),
                    }
            ),

            new Question(
                    "Партия предлагает уменьшить срок службы в Армии, требуемый для получения квартиры от государства",
                    new Question.Answer[]{
                            new Question.Answer("Согласится", 1, getRandomNum(), 0, 5, 0,
                                    0, 20, -10, 0, 10),
                            new Question.Answer("Отказать", 1, getRandomNum(), 0, -5, 0,
                                    0, -10, 0, 0, 0),
                    }
            ),

            new Question(
                    "Народ, через новую петицию, предлагает уменьшить срок службы в армии, требуемый для получения квартиры от государства",
                    new Question.Answer[]{
                            new Question.Answer("Согласится", 1, getRandomNum(), 4, 0, 0,
                                    0, 20, -10, 0, 10),
                            new Question.Answer("Отказать", 1, getRandomNum(), -5, 0, 0,
                                    0, -10, 0, 0, 0),
                    }
            ),

            new Question(
                    "Один из видов вооружения нашей армии устаревает. Требуется выделить бюджет",
                    new Question.Answer[]{
                            new Question.Answer("Выделить деньги", 1, getRandomNum(), 0, 10, -100,
                                    0, 20, 0, 10, 0),
                            new Question.Answer("Отказать", 1, getRandomNum(), 0, 0, 0,
                                    0, -10, 0, 0, 0),
                    }
            ),

            new Question(
                    "Народ,через петиции, предлагает поддержать малый бизнес",
                    new Question.Answer[]{
                            new Question.Answer("Выделить деньги на поддержку", 1, getRandomNum(), 10, 2, -20,
                                    0, 0, 0, 0, -10),
                            new Question.Answer("Отказать", 1, getRandomNum(), -5, 0, 0,
                                    0, 0, 0, 0, 0),
                    }
            ),

            new Question(
                    "Партия предлагает поддержать крупный бизнес",
                    new Question.Answer[]{
                            new Question.Answer("Выделить деньги на поддержку", 1, getRandomNum(), 0, 15, -50,
                                    0, 0, 0, 0, -15),
                            new Question.Answer("Отказать", 1, getRandomNum(), 0, -5, 0,
                                    0, 0, 0, 0, 0),
                    }
            ),

            new Question(
                    "В столице намечается одно общественное мероприятие.",
                    new Question.Answer[]{
                            new Question.Answer("Посетить мероприятие", 1, getRandomNum(), 10, 0, 0,
                                    0, 0, 5, -20, 0),
                            new Question.Answer("Выделить деньги организаторам", 1, getRandomNum(), 5, -1, -10,
                                    0, 0, 0, 0, 0),
                            new Question.Answer("Проигнорировать", 1, getRandomNum(), 0, 0, 0,
                                    0, 0, 0, 0, 0),

                    }
            ),

            new Question(
                    "Стоит повысить охрану правительственных зданий?",
                    new Question.Answer[]{
                            new Question.Answer("Да", 1, getRandomNum(), -3, 10, 0,
                                    0, -5, 0, 10, 3),
                            new Question.Answer("Нет", 1, getRandomNum(), 0, 0, 10,
                                    5, 0, 0, 0, 0),

                    }
            ),


    };

   public int getRandomNum(){
    random_num=1+(int) (Math.random()*17);
    return random_num;
   }

    public void addScore(int score) {
        this.score += score;
    }

    public int getScore() {
        return score;
    }

    public int getCurrentStep() {
        return currentStep;
    }

    public int getAuthorityNation() {
        return authorityNation;
    }

    public void addAuthorityNation(int authorityNation) {
       if(authorityNation==0) this.authorityNation -=(this.massMediaFreedom/20);
       this.authorityNation += authorityNation+(this.massMediaFreedom/20);
        if(this.authorityNation>100) this.authorityNation=100;
    }

    public int getAuthorityParty() {
        return authorityParty;
    }

    public void addAuthorityParty(int authorityParty) {
        if(authorityParty==0) this.authorityParty +=(this.massMediaFreedom/20);
        this.authorityParty += authorityParty-(this.massMediaFreedom/20);
        if(this.authorityParty>100) this.authorityParty=100;
    }

    public int getTreasure() {
        return treasure;
    }

    public void addTreasure(int treasure) {
        this.treasure += treasure;
        this.treasure-=cost;
    }

    public int getMassMediaFreedom() {
        return massMediaFreedom;
    }

    public void addMassMediaFreedom(int massMediaFreedom) {
        this.massMediaFreedom += massMediaFreedom;
        if(this.massMediaFreedom>100) this.massMediaFreedom=100;
    }

    public int getAuthorityArmy() {
        return authorityArmy;
    }

    public void addAuthorityArmy(int authorityArmy) {
        if(authorityArmy==0) this.authorityArmy -=(this.massMediaFreedom/20);
        this.authorityArmy += authorityArmy+(this.massMediaFreedom/20);;
        if(this.authorityArmy>100) this.authorityArmy=100;
    }

    public int getInfrastructure() {
        return infrastructure;
    }

    public void addInfrastructure(int infrastructure) {
        this.infrastructure += infrastructure;
        if(this.infrastructure>100) this.infrastructure=100;
    }

    public int getYourSafety() {
        return yourSafety;
    }

    public void addYourSafety(int yourSafety) {
        this.yourSafety += yourSafety;
        if(this.yourSafety>100) this.yourSafety=100;
    }

    public int getCost() { return cost; }

    public void addCost(int cost) {
        this.cost += cost;
    }

    public Question getQuestion(int index) {
        if (index >= 0 && index < questions.length) {
            return questions[index];
        }
        return null;
    }

    public static class Question {
        private final String description;
        private final Answer[] answers;

        public Question(String description, Answer[] answers) {
            this.description = description;
            this.answers = answers;
        }

        public String getDescription() {
            return description;
        }

        public Answer[] getAnswers() {
            return answers;
        }

        public static class Answer {
            private final String name;
            private final int score;
            private final int nextStep;
            private final int authorityNation;
            private final int authorityParty;
            private final int treasure;
            private final int massMediaFreedom;
            private final int authorityArmy;
            private final int infrastructure;
            private final int yourSafety;
            private final int cost;


            public Answer(String name, int score, int nextStep, int authorityNation, int authorityParty,
                          int treasure, int massMediaFreedom, int authorityArmy, int infrastructure, int yourSafety, int cost) {
                this.name = name;
                this.score = score;
                this.nextStep = nextStep;
                this.authorityNation = authorityNation;
                this.authorityParty = authorityParty;
                this.treasure = treasure;
                this.massMediaFreedom = massMediaFreedom;
                this.authorityArmy = authorityArmy;
                this.infrastructure = infrastructure;
                this.yourSafety = yourSafety;
                this.cost = cost;
            }

            public String getName() {
                return name;
            }

            public int getScore() {
                return score;
            }

            public int getNextStep() {
                return nextStep;
            }

            public int getAuthorityNation() {
                return authorityNation;
            }

            public int getAuthorityParty() {
                return authorityParty;
            }

            public int getTreasure() {
                return treasure;
            }

            public int getMassMediaFreedom() {
                return massMediaFreedom;
            }

            public int getAuthorityArmy() {
                return authorityArmy;
            }

            public int getInfrastructure() {
                return infrastructure;
            }

            public int getYourSafety() {
                return yourSafety;
            }

            public int getCost() {
                return cost;
            }


        }
    }
}
