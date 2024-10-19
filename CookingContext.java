// Context: 文脈情報を保持するクラス
class CookingContext {
    private String currentStep;

    public String getCurrentStep() {
        return currentStep;
    }

    public void setCurrentStep(String currentStep) {
        this.currentStep = currentStep;
    }
}