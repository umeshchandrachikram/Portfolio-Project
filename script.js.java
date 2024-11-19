function addRecommendation() {
  const recommendationInput = document.getElementById('recommend_input');
  const recommendationText = recommendationInput.value;

  if (recommendationText) {
      const recommendationDiv = document.createElement('div');
      recommendationDiv.className = 'recommendation';
      recommendationDiv.innerText = recommendationText;

      document.getElementById('recommendations').appendChild(recommendationDiv);
      recommendationInput.value = ''; 

      showPopup(true); 
  }
}

function showPopup(success) {
  const popup = document.getElementById('popup');
  if (success) {
      popup.style.display = 'block';
      setTimeout(() => { popup.style.display = 'none'; }, 3000); 
  }
}
