import unittest
import Task2

class TesttheGradeDifferenceFunction(unittest.TestCase):

	def test_that_the_Grade_difference_return_correct_results(self):
			result = Task1.multiply_number(10)
			self.assertEqual(result ,20 )
	
	def test_the_Grade_difference_returns_validation_incorrect_value(self):
		self.assertRaises(ValueError)

	def test_that_the_Grade_difference_function_is_string(self):
		response = Function_snacks.get_Grade("")
		self.assertRaises(ValueError)


