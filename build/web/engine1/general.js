/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function() {
    $(".button").click(function(e) {
        $("body").append('<div class="overlay"></div>');
		$(".popup").show();
		
		$(".close").click(function(e) {
			$(".popup, .overlay").hide();
		});
    });
});
